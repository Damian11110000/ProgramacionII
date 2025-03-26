package com.jgcompany;


public class Biblioteca {

    public Libro[] libros = new Libro[100];
    public Lector[] lector = new Lector[100];


    public Libro obtenerLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void listarLibros() {
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] != null) {
                System.out.println(libros[i]);
            }
        }
    }

    public void agregarLibro(Libro libro){

        boolean esLibroAgregado = false;
        for (int i = 0; i < libros.length; i++) {
            if(libros[i] == null){
                libros[i] = libro;
                esLibroAgregado = true;
                System.out.println("Libro  agregado con exito");
                break;
            }
        }

        if(!esLibroAgregado){
            System.out.println("Libro no agregado");
        }
    }
}
