package sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}