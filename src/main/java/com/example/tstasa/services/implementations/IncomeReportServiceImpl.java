package com.example.tstasa.services.implementations;

import com.example.tstasa.entities.IncomeReport;
import com.example.tstasa.repositories.IncomeReportRepository;
import com.example.tstasa.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeReportServiceImpl implements IncomeReportService {

    @Autowired
    private IncomeReportRepository incomeReportRepository;

    @Override
    public List<IncomeReport> getAllIncomeReports() {
        return incomeReportRepository.findAll();
    }

    @Override
    public IncomeReport getIncomeReportById(Long id) {
        return incomeReportRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("IncomeReport not found"));
    }

    @Override
    public IncomeReport createIncomeReport(IncomeReport incomeReport) {
        return incomeReportRepository.save(incomeReport);
    }

    @Override
    public IncomeReport updateIncomeReport(Long id, IncomeReport incomeReport) {
        return incomeReportRepository.findById(id)
                .map(existingIncomeReport -> {
                    existingIncomeReport.setName(incomeReport.getName());
                    existingIncomeReport.setDescription(incomeReport.getDescription());

                    return incomeReportRepository.save(existingIncomeReport);
                })
                .orElseThrow(() -> new NotFoundException("IncomeReport not found"));
    }

    @Override
    public void deleteIncomeReport(Long id) {
        if (!incomeReportRepository.existsById(id)) {
            throw new NotFoundException("IncomeReport not found");
        }
        incomeReportRepository.deleteById(id);
    }
}