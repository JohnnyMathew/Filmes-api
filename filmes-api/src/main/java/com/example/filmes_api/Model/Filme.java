package com.example.filmes_api.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório")
    private String titulo;

    private String genero;

    private Integer ano;

    // Getters e Setters
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }
}

