package sn.edu.isepdiamniadio.tic.dbe.diarrashow.initRole;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Role;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.User;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.service.RoleService;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.service.Userservice;

@Component
public class InitRole implements CommandLineRunner {

    @Autowired
    private RoleService roleService;

    @Autowired
    private Userservice userservice;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("#### execution initRole ...");
        if (roleService.count()==0){
            System.out.println("#### Pas de role dans la base.");
            System.out.println("#### Enregistrement du role admin.");
            Role presidentassemblee= Role.builder()
                    .code("psa")
                    .nom("presidentassemblee")
                    .build();
            roleService.create(presidentassemblee);

            Role   depute= Role.builder()
                    .code("dep")
                    .nom("depute")

                    .build();
            roleService.create(depute);

            User aicha = User.builder()
                    .email("sokhnaaichambengue19@gmail.com")
                    .password("1234")
                    .prenom("Aicha")
                    .nom("Mbengue")
                    .roles(List.of(presidentassemblee))
                    .build();
            userservice.save(aicha );
        }

    }
}


