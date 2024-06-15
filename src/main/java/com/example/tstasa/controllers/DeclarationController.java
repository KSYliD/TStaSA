package com.example.tstasa.controllers;

import com.example.tstasa.entities.Declaration;
import com.example.tstasa.services.implementations.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/declarations")
public class DeclarationController {

    @Autowired
    private DeclarationService declarationService;

    @GetMapping
    public List<Declaration> getAllDeclarations() {
        return declarationService.getAllDeclarations();
    }

    @GetMapping("/{id}")
    public Declaration getDeclarationById(@PathVariable Long id) {
        return declarationService.getDeclarationById(id);
    }

    @PostMapping
    public Declaration createDeclaration(@RequestBody Declaration declaration) {
        return declarationService.createDeclaration(declaration);
    }

    @PutMapping("/{id}")
    public Declaration updateDeclaration(@PathVariable Long id, @RequestBody Declaration declaration) {
        return declarationService.updateDeclaration(id, declaration);
    }

    @DeleteMapping("/{id}")
    public void deleteDeclaration(@PathVariable Long id) {
        declarationService.deleteDeclaration(id);
    }
}