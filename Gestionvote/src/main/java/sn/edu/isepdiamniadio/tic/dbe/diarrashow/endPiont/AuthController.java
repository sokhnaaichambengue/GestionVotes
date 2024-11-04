package sn.edu.isepdiamniadio.tic.dbe.diarrashow.endPiont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dto.AuthRequest;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.User;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.UserToken;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.service.UserTokenService;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.service.Userservice;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private  final UserTokenService userTokenService;

    private  final Userservice userService;

    @Autowired
    public AuthController(UserTokenService userTokenService,Userservice userService) {
        this.userTokenService = userTokenService;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthRequest authRequest) {
        System.out.println("Login request: " + authRequest);
        UserToken userToken= userTokenService.login(authRequest.getUsername(), authRequest.getPassword());
        return ResponseEntity.ok(userToken);
    }

    @PostMapping("/inscrire")
    public ResponseEntity incrire(@RequestBody User user) {
        if (user.getPrenom() == null || user.getNom() == null || user.getNom().isBlank() || user.getPrenom().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        userService.save(user);
        return ResponseEntity.status(201).build();  //bodey pour retourner un texte et build si on veut rien
    }
}



