package sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class VoteClos {
    @Id
    private int id_vote;
    private String etat_vote;
    private String date_vote;

}
