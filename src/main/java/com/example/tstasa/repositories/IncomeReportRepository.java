package com.example.tstasa.repositories;

import com.example.tstasa.entities.IncomeReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeReportRepository extends JpaRepository<IncomeReport, Long> {
}
