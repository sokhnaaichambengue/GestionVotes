package sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    //Permet de facilier la creation d'un objet de classe, en utilisant une seul instruction.
    @Entity

    public class Role {
        @Id

        private String code;

        private String nom;

        @ManyToMany(mappedBy = "roles")
        @JsonIgnore
        private List<User> users;
    }


