package sn.edu.isepdiamniadio.tic.dbe.diarrashow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao.VoteouvertRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Voteouvert;

import java.util.List;

@Component
public class Voteouvertservice {
    @Autowired
    private VoteouvertRepository voteouvertRepository;

    public List<Voteouvert> findAll() {
        return voteouvertRepository.findAll();
    }

    public void ajoutervoteouvert(Voteouvert voteouvert) {
        voteouvertRepository.save(voteouvert);
    }

    public void modifiervoteouvert(Voteouvert voteouvert) {
        voteouvertRepository.save(voteouvert);
    }

    public void supprimervoteouvert(Voteouvert voteouvert) {
        voteouvertRepository.delete(voteouvert);
    }

    public ResponseEntity<String> addbienvote(@RequestBody Voteouvert voteouvert) {
        voteouvertRepository.save(voteouvert);
        return ResponseEntity.status(201).body("Honorable depute aicha votre vote est bien pris en compte");
    }

    public ResponseEntity<String> adddejavote(@RequestBody Voteouvert voteouvert) {
        voteouvertRepository.save(voteouvert);
        return ResponseEntity.status(403).body("Honorable  depute aicha vous avez deja vote");
    }

    public ResponseEntity<String> adddidentifiantvote(@RequestBody Voteouvert voteouvert) {
        voteouvertRepository.save(voteouvert);
        return ResponseEntity.status(401).body("Honorable  depute aicha votre identifiant de vote est introuvale");
    }

    public ResponseEntity<String> addderreurserveur(@RequestBody Voteouvert voteouvert) {
        voteouvertRepository.save(voteouvert);
        return ResponseEntity.status(500).body("Honorable  depute aicha reessayer plutart une errreur est survenue veillez ");
    }
}
