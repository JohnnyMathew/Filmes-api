package com.example.filmes_api.Service;

import com.example.filmes_api.Model.Filme;
import com.example.filmes_api.Repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public Filme criar(Filme filme) {
        return repository.save(filme);
    }

    public List<Filme> listarTodos() {
        return repository.findAll();
    }

    public Optional<Filme> buscarPorId(Long id) {
        return repository.findById(id);
    }
}

