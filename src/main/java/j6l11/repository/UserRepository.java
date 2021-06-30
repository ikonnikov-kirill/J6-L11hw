package j6l11.repository;

import j6l11.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();

    User findUserByLogin(String login);

    User findById(int id);

}
