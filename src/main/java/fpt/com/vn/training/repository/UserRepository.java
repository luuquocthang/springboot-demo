package fpt.com.vn.training.repository;

import fpt.com.vn.training.entities.Employee;
import fpt.com.vn.training.entities.User;
import fpt.com.vn.training.enums.ActiveEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Page<User> findAll(Pageable pageable);

    Page<User> findByActive(ActiveEnum activeEnum, Pageable pageable);
}
