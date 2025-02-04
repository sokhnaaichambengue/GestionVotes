package sn.edu.isepdiamniadio.tic.dbe.diarrashow.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
    @Id
    private String username;
    private String password;
}
