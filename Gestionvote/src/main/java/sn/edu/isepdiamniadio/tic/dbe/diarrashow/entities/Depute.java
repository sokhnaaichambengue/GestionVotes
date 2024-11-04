package sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Depute {
    @Id
    private int id_depute;
    private String prenom_depute;
    private String nom_depute;
    private String adresse_depute;
    private String Date_naissance;
    private int numcni;


    @RestController
    @RequestMapping
    public static class Voteclos {

    }
}
