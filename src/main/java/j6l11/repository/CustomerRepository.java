package j6l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import j6l11.model.Customer;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAll();

    Customer findById(int id);

}
