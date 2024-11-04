package sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Voteouvert {
    @Id
    private  int id_vote;
    private int id_depute;
    private String libelle;
    private String date_vote;
    @ManyToMany
    private List<Voteouvert> voteouverts;

}
