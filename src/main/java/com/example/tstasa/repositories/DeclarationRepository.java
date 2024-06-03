package com.example.tstasa.repositories;

import com.example.tstasa.entities.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclarationRepository extends JpaRepository<Declaration, Long> {
}
