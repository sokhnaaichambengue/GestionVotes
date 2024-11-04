package sn.edu.isepdiamniadio.tic.dbe.diarrashow.endPiont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Depute;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.service.Deputeservice;

import java.util.List;

@RestController
@RequestMapping("depute")
public class DeputeController {
    @Autowired
    private Deputeservice deputeservice;
    @GetMapping
    public List<Deputeservice> findAll() {
       deputeservice.getDeputes();
       return null;
    }
    @PostMapping
   public ResponseEntity<Depute> create(@RequestBody Depute dp) {
        deputeservice.adddepute(dp);
        return ResponseEntity.status(200).build();
    }
    @PutMapping
    public ResponseEntity<Depute> update(@RequestBody Depute dp) {
        deputeservice.adddepute(dp);
        return ResponseEntity.status(200).build();
    }
    @DeleteMapping
    public ResponseEntity<Depute> delete(@RequestBody Depute dp) {
        deputeservice.deletedepute(dp);
        return ResponseEntity.status(200).build();
    }



}
