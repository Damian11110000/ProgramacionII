package com.jgcompany;

import static com.jgcompany.GeneroLibros.*;


public class PruebaLibros {

    public static void main(String[] args) {




        Lector lector = new Lector("Juan",17);
        Biblioteca biblioteca = new Biblioteca();
        Bibliotecario bibliotecario = new Bibliotecario();

        bibliotecario.agregarLibroBiblioteca("50 Sombras",
                    "Mack","Damian","324234",true,COMEDIA,biblioteca);

        bibliotecario.agregarLibroBiblioteca("50 Sombras 2",
                "Mack","Damian","3242324",true,TERROR,biblioteca);

        Libro libro = biblioteca.obtenerLibro("50 Sombras");
        Libro libro2 = biblioteca.obtenerLibro("50 Sombras 2");

        bibliotecario.nombre = "Damian";
        bibliotecario.prestarLibro(libro,lector);
        bibliotecario.prestarLibro(libro2,lector);


        lector.listarLibros();

        bibliotecario.recoguerLibro(libro,lector);
        bibliotecario.prestarLibro(libro,lector);

        lector.listarLibros();

        bibliotecario.listarLibrosBiblioteca(biblioteca);


    }
}
