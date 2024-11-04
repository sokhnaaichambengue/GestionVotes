package sn.edu.isepdiamniadio.tic.dbe.diarrashow.endPiont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Depute;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Voteouvert;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.service.Deputeservice;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.service.Voteouvertservice;

import java.util.List;

@RestController
@RequestMapping("vote")
public class Voteouvertcontroller {
    @Autowired
    private Voteouvertservice voteouvertservice;
    @GetMapping
    public String creationvote(){
        return "vote cree avec succes";
    }

    public List<Voteouvert> findAll() {
       voteouvertservice.findAll();
        return null;
    }
    @PostMapping
    public ResponseEntity<Voteouvert> create(@RequestBody Voteouvert vote) {
        voteouvertservice.ajoutervoteouvert(vote);
        return ResponseEntity.status(200).build();
    }
    @PutMapping
    public ResponseEntity<Voteouvert> update(@RequestBody Voteouvert vote) {
        voteouvertservice.modifiervoteouvert(vote);
        return ResponseEntity.status(200).build();
    }
    @DeleteMapping
    public ResponseEntity<Voteouvert> delete(@RequestBody Voteouvert vote ) {
        voteouvertservice .supprimervoteouvert(vote );
        return ResponseEntity.status(200).build();
    }

}
