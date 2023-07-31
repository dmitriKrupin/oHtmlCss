package pro.k12.project.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.k12.project.security.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
