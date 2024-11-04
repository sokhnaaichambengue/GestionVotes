package sn.edu.isepdiamniadio.tic.dbe.diarrashow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao.DeputeRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Depute;

import java.util.List;

@Component
public class Deputeservice {
    @Autowired
    private DeputeRepository deputeRepository;
   public List<Depute> getDeputes() {
       return deputeRepository.findAll();
   }
   public void adddepute(Depute depute) {
       deputeRepository.save(depute);
   }
   public void editdepute(Depute depute) {
       deputeRepository.save(depute);
   }
   public void deletedepute(Depute depute) {
       deputeRepository.delete(depute);
   }
}
