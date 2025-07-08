package com.example.filmes_api.Controller;

import com.example.filmes_api.Model.Filme;
import com.example.filmes_api.Service.FilmeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @PostMapping
    public ResponseEntity<?> criar(@Valid @RequestBody Filme filme) {
        return ResponseEntity.ok(service.criar(filme));
    }

    @GetMapping
    public ResponseEntity<List<Filme>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

