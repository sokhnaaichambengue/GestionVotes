package sn.edu.isepdiamniadio.tic.dbe.diarrashow.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao.VoteouvertRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Depute;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Voteouvert;

@Component
public class Initvoteouvert implements CommandLineRunner {
    @Autowired
    private VoteouvertRepository voteouvertRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("pas de vote dans la base de donnees");
        Voteouvert [] voteouverts={
             new Voteouvert(1,1,"3","17/11/2024",null),
                new Voteouvert(2,2,"3","17/11/2024",null),
                new Voteouvert(3,3,"3","17/11/2024",null),
        };
        for (Voteouvert voteouvert : voteouverts){
            System.out.println("Ajoutons les votes dans la base de donnees");

            voteouvertRepository.save(voteouvert);

        }
       Voteouvert voteouvert1=voteouvertRepository.findById(1).get();
        voteouvert1.setDate_vote("15/09/2024");
        voteouvertRepository.save(voteouvert1);
        Voteouvert voteouvert3=voteouvertRepository.findById(3).get();
        voteouvertRepository.delete(voteouvert3);

    }

       }



