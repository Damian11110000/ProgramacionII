package com.jgcompany;

public class Bibliotecario {


    public String nombre;
    private static  int idGlobal;
    public int id;

    public Bibliotecario() {
        id = idGlobal++;
    }


    public void prestarLibro(Libro libro, Lector lector){

        if(libro.genero == GeneroLibros.TERROR && lector.edad < 18){
            System.out.println("No es posible prestar un libro del genero "+GeneroLibros.TERROR.getGenero()
                        +" con una clasificacion "+ GeneroLibros.TERROR.getClasificacion() +" a un menor");
            return;
        }

        lector.tomarPrestado(libro);
    }

    public void recoguerLibro(Libro libro,Lector lector){
        lector.devolverLibro(libro);
    }

    public void agregarLibroBiblioteca(String titulo,String editorial,String autor,String isbn,boolean disponible,GeneroLibros generoLibros, Biblioteca biblioteca){

                Libro libro = new Libro();
                libro.titulo = titulo;
                libro.editorial = editorial;
                libro.autor = autor;
                libro.isbn = isbn;
                libro.disponible = disponible;
                libro.genero = generoLibros;
                biblioteca.agregarLibro(libro);

    }

    public void listarLibrosBiblioteca(Biblioteca biblioteca){
        biblioteca.listarLibros();
    }

}
