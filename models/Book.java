package com.aluracursos.literalura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String autor;
    private String titulo;
    private String lenguaje;
    private Integer descargas;

    public Book(){}

    public Book(ResultDetails bookData) {

        this.titulo = bookData.titulo();
        this.autor = bookData.autorList().get(0).nombreAutor();
        this.lenguaje = bookData.language().get(0);
        this.descargas = bookData.descargas();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public Integer getDescargas() {
        return descargas;
    }

    public void setDescargas(Integer descargas) {
        this.descargas = descargas;
    }
}
