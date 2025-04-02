package com.jgcompany;


import com.jgcompany.Persona;



public class Biblioteca {

    Persona persona = new Persona();

    public Libro[] libros = new Libro[100];
    public Lector[] lector = new Lector[100];


    public boolean AgregarLector(Lector lector){

        boolean agregado = false;
        for (int i = 0; i < this.lector.length; i++) {
            if(this.lector[i] == null){
                this.lector[i] = lector;
                agregado = true;
                break;
            }
        }

        return agregado;
    }

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

    public Lector[] obtenerLectores(){
        return lector;
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
