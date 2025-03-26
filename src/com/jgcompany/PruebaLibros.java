package com.jgcompany;

import static com.jgcompany.GeneroLibros.*;


public class PruebaLibros {

    public static void main(String[] args) {





        Biblioteca biblioteca = new Biblioteca();
        Bibliotecario bibliotecario = new Bibliotecario();

        Lector lector =bibliotecario.suscribirLector("damian",20,biblioteca);

        Lector lectorJ =bibliotecario.suscribirLector("juan",17,biblioteca);

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

        bibliotecario.listarLectores(biblioteca);

    }
}
