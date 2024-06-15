package com.example.tstasa.repositories;

import com.example.tstasa.entities.user.Role;
import com.example.tstasa.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(long id);
    List<User> findAll();
    @Override
    <S extends User> S save(S entity);

    Optional<User> findByEmail(String email);
    void deleteById(long id);
    List<User> findAllByRole(Role role);
    boolean existsByEmail(String email);
}