package j6l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import j6l11.model.Role;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Integer> {

    List<Role> findRoleById(int id);
}