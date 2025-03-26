package com.jgcompany;

import java.util.Objects;

public class Libro {

    public String titulo;
    public String autor;
    public String editorial;
    public String isbn;
    public boolean disponible;
    public GeneroLibros genero;


    public void prestar(){
        this.disponible = false;
    }

    public  void recoger(){
        this.disponible = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;
        return disponible == libro.disponible
                && Objects.equals(titulo, libro.titulo)
                && Objects.equals(autor, libro.autor)
                && Objects.equals(editorial, libro.editorial)
                && Objects.equals(isbn, libro.isbn)
                && Objects.equals(genero, libro.genero);
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
