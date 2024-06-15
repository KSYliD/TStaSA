package com.example.tstasa.services.implementations;

import com.example.tstasa.entities.Declaration;

import java.util.List;

public interface DeclarationService {
    List<Declaration> getAllDeclarations();
    Declaration getDeclarationById(Long id);
    Declaration createDeclaration(Declaration declaration);
    Declaration updateDeclaration(Long id, Declaration declaration);
    void deleteDeclaration(Long id);
}