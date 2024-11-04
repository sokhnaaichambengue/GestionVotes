package sn.edu.isepdiamniadio.tic.dbe.diarrashow.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao.DeputeRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Depute;

@Component
public class Initdepute implements CommandLineRunner {
    @Autowired
    private DeputeRepository deputeRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("pas de depute dans la base de donnees");
        Depute [] deputes = {
                new Depute(1,"aicha","Mbengue","thies","19/06/03",2900238),
                new Depute(2,"Rama","Diop","Dakar","20/09/1999",24000567),
                new Depute(3,"oumi","sy","Matam","15/06/1998",25005637),
                new Depute(4,"codou","sy","saint-louis","17/06/1998",25006637),


        };
        for (Depute depute : deputes) {
            System.out.println("Ajoutons les deputes dans la base de donnees");
            deputeRepository.save(depute);
        }
        Depute depute3= deputeRepository.findById(3).get();
        depute3.setAdresse_depute("Sedhiou");
        deputeRepository.save(depute3);
        Depute depute4= deputeRepository.findById(4).get();
        deputeRepository.delete(depute4);


    }
}
