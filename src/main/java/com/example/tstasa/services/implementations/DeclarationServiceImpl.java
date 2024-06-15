package com.example.tstasa.services.implementations;

import com.example.tstasa.entities.Declaration;
import com.example.tstasa.repositories.DeclarationRepository;
import com.example.tstasa.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationServiceImpl implements DeclarationService {

    @Autowired
    private DeclarationRepository declarationRepository;

    @Override
    public List<Declaration> getAllDeclarations() {
        return declarationRepository.findAll();
    }

    @Override
    public Declaration getDeclarationById(Long id) {
        return declarationRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Declaration not found"));
    }

    @Override
    public Declaration createDeclaration(Declaration declaration) {
        return declarationRepository.save(declaration);
    }

    @Override
    public Declaration updateDeclaration(Long id, Declaration declaration) {
        return declarationRepository.findById(id)
                .map(existingDeclaration -> {
                    existingDeclaration.setName(declaration.getName());
                    existingDeclaration.setDescription(declaration.getDescription());

                    return declarationRepository.save(existingDeclaration);
                })
                .orElseThrow(() -> new NotFoundException("Declaration not found"));
    }

    @Override
    public void deleteDeclaration(Long id) {
        if (!declarationRepository.existsById(id)) {
            throw new NotFoundException("Declaration not found");
        }
        declarationRepository.deleteById(id);
    }
}