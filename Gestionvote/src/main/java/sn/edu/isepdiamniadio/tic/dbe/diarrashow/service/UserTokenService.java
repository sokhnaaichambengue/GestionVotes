package sn.edu.isepdiamniadio.tic.dbe.diarrashow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao.UserTokenRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.User;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.UserToken;

import java.util.Date;
import java.util.Optional;

@Service
public class UserTokenService {

    private static  final String DICO="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm123456789";

    private static final Integer TOKEN_LENGTH = 144;

    @Autowired
    private UserTokenRepository userTokenRepository;

    @Autowired
    private Userservice userservice;

    public void save(UserToken userToken) {
        userTokenRepository.save(userToken);
    }

    public Optional<UserToken> findByToken(String token) {
        return userTokenRepository.findById(token);
    }

    public UserToken generateUserToken(User user){
        UserToken userToken = new UserToken();
        userToken.setUser(user);
        userToken.setToken(newToken());
        Date now = new Date();
        int nbMilliSeconds = 10*60*60*1000;
        Date expiryDate = new Date(now.getTime() + nbMilliSeconds);
        userToken.setNotBefore(now);
        userToken.setNotAfter(expiryDate);
        userTokenRepository.save(userToken);
        return userToken;

    }

    public String newToken(){

        Optional<UserToken>  userToken;
        String token="";
        do{
            token="";
            for(int i=0;i<TOKEN_LENGTH;i++){
                int position=(int)(Math.random()*DICO.length());
                token+=DICO.charAt(position);
            }
            userToken= userTokenRepository.findById(token);
        } while(userToken.isPresent());
        return token;
    }

    public UserToken login(String username, String password){
        Optional<User> user= userservice.findByEmail(username);
        if(user.isPresent()){
            if(user.get().getPassword().equals(password)){
                UserToken res= generateUserToken(user.get());
                return res;
            }
        }
        throw new UsernameNotFoundException("Login ou mot de pass incorrecte.");
    }
}


