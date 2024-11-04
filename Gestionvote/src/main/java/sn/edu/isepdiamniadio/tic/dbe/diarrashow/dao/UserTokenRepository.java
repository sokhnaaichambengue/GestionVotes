package sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.UserToken;

public interface UserTokenRepository extends JpaRepository<UserToken, String> {
}