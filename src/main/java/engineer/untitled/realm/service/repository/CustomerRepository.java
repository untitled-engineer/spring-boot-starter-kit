package engineer.untitled.realm.service.repository;

import engineer.untitled.realm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}