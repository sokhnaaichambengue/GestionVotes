package sn.edu.isepdiamniadio.tic.dbe.diarrashow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao.UserRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.User;

import java.util.List;
import java.util.Optional;

@Component
public class Userservice {
    @Autowired
    private UserRepository userRepository;
    public List<sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.User> findAll() {
        userRepository.findAll();
        return null;
    }

    public void save(User aicha) {
        userRepository.save(aicha);
    }



public Optional<sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.User> findByEmail(String email) {
    return userRepository.findByEmail(email);
}

}
