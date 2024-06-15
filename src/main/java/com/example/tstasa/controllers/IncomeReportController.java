package com.example.tstasa.controllers;

import com.example.tstasa.entities.IncomeReport;
import com.example.tstasa.services.implementations.IncomeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incomeReports")
public class IncomeReportController {

    @Autowired
    private IncomeReportService incomeReportService;

    @GetMapping
    public List<IncomeReport> getAllIncomeReports() {
        return incomeReportService.getAllIncomeReports();
    }

    @GetMapping("/{id}")
    public IncomeReport getIncomeReportById(@PathVariable Long id) {
        return incomeReportService.getIncomeReportById(id);
    }

    @PostMapping
    public IncomeReport createIncomeReport(@RequestBody IncomeReport incomeReport) {
        return incomeReportService.createIncomeReport(incomeReport);
    }

    @PutMapping("/{id}")
    public IncomeReport updateIncomeReport(@PathVariable Long id, @RequestBody IncomeReport incomeReport) {
        return incomeReportService.updateIncomeReport(id, incomeReport);
    }

    @DeleteMapping("/{id}")
    public void deleteIncomeReport(@PathVariable Long id) {
        incomeReportService.deleteIncomeReport(id);
    }
}