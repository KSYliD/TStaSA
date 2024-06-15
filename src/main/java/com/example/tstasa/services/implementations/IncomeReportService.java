package com.example.tstasa.services.implementations;

import com.example.tstasa.entities.IncomeReport;

import java.util.List;

public interface IncomeReportService {
    List<IncomeReport> getAllIncomeReports();
    IncomeReport getIncomeReportById(Long id);
    IncomeReport createIncomeReport(IncomeReport incomeReport);
    IncomeReport updateIncomeReport(Long id, IncomeReport incomeReport);
    void deleteIncomeReport(Long id);
}