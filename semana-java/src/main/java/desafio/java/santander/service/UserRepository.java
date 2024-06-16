package desafio.java.santander.service;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.java.santander.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);

}
