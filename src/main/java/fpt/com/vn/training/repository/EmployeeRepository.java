package fpt.com.vn.training.repository;

import fpt.com.vn.training.entities.Employee;
import fpt.com.vn.training.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
