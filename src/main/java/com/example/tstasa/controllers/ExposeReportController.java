package com.example.tstasa.controllers;

import com.example.tstasa.entities.ExposeReport;
import com.example.tstasa.services.implementations.ExposeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exposeReports")
public class ExposeReportController {

    @Autowired
    private ExposeReportService exposeReportService;

    @GetMapping
    public List<ExposeReport> getAllExposeReports() {
        return exposeReportService.getAllExposeReports();
    }

    @GetMapping("/{id}")
    public ExposeReport getExposeReportById(@PathVariable Long id) {
        return exposeReportService.getExposeReportById(id);
    }

    @PostMapping
    public ExposeReport createExposeReport(@RequestBody ExposeReport exposeReport) {
        return exposeReportService.createExposeReport(exposeReport);
    }

    @PutMapping("/{id}")
    public ExposeReport updateExposeReport(@PathVariable Long id, @RequestBody ExposeReport exposeReport) {
        return exposeReportService.updateExposeReport(id, exposeReport);
    }

    @DeleteMapping("/{id}")
    public void deleteExposeReport(@PathVariable Long id) {
        exposeReportService.deleteExposeReport(id);
    }
}