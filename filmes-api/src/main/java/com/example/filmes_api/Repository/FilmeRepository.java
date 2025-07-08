package com.example.filmes_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.filmes_api.Model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
