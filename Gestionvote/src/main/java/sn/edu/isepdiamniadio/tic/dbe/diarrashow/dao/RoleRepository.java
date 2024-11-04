package sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}