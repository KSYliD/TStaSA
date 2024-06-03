package com.example.tstasa.repositories;

import com.example.tstasa.entities.user.Role;
import com.example.tstasa.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(long id);
    List<User> findAll();
    User save(User user);
    void deleteById(long id);
    User findByEmail(String email);
    List<User> findAllByRole(Role role);
    boolean existsByEmail(String email);
}