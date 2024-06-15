package com.example.tstasa.services.implementations;

import com.example.tstasa.entities.ExposeReport;

import java.util.List;

public interface ExposeReportService {
    List<ExposeReport> getAllExposeReports();
    ExposeReport getExposeReportById(Long id);
    ExposeReport createExposeReport(ExposeReport exposeReport);
    ExposeReport updateExposeReport(Long id, ExposeReport exposeReport);
    void deleteExposeReport(Long id);
}
