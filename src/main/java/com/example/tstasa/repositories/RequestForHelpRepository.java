package com.example.tstasa.repositories;

import com.example.tstasa.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestForHelpRepository extends JpaRepository<Request, Long> {
}
