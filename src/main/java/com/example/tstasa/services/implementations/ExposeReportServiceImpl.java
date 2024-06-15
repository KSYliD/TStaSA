package com.example.tstasa.services.implementations;

import com.example.tstasa.entities.ExposeReport;
import com.example.tstasa.repositories.ExposeReportRepository;
import com.example.tstasa.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExposeReportServiceImpl implements ExposeReportService {

    @Autowired
    private ExposeReportRepository exposeReportRepository;

    @Override
    public List<ExposeReport> getAllExposeReports() {
        return exposeReportRepository.findAll();
    }

    @Override
    public ExposeReport getExposeReportById(Long id) {
        return exposeReportRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ExposeReport not found"));
    }

    @Override
    public ExposeReport createExposeReport(ExposeReport exposeReport) {
        return exposeReportRepository.save(exposeReport);
    }

    @Override
    public ExposeReport updateExposeReport(Long id, ExposeReport exposeReport) {
        return exposeReportRepository.findById(id)
                .map(existingExposeReport -> {
                    existingExposeReport.setName(exposeReport.getName());
                    existingExposeReport.setDescription(exposeReport.getDescription());

                    return exposeReportRepository.save(existingExposeReport);
                })
                .orElseThrow(() -> new NotFoundException("ExposeReport not found"));
    }

    @Override
    public void deleteExposeReport(Long id) {
        if (!exposeReportRepository.existsById(id)) {
            throw new NotFoundException("ExposeReport not found");
        }
        exposeReportRepository.deleteById(id);
    }
}