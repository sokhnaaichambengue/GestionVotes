package sn.edu.isepdiamniadio.tic.dbe.diarrashow.service;


import java.util.List;
import java.util.Optional;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.dao.RoleRepository;
import sn.edu.isepdiamniadio.tic.dbe.diarrashow.entities.Role;

@Service

public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public void create(Role role) {
        Optional<Role> dbRole= roleRepository.findById(role.getCode());
        if (dbRole.isPresent()) {
            throw new EntityExistsException("Le role dont le code est "+ role.getCode()+" existe deja.");
        }

        roleRepository.save(role);
    }

    public long count(){
        return  roleRepository.count();
    }
}


