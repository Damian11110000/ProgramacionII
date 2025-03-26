package com.jgcompany;

import java.util.Arrays;

public class Lector {

    public String nombre;
    public static int idGlobal;
    public int id;
    public Libro[] libros;
    public int edad;


    public Lector(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.libros = new Libro[20];
        this.id = idGlobal++;
    }

    public void tomarPrestado(Libro libro){

        if(libro.disponible){
            for(int i=0;i<libros.length;i++){
                if(libros[i] == null){
                    libro.prestar();
                    libros[i] = libro;
                    break;
                }
            }
        }

    }

    public void devolverLibro(Libro libro){

        for (int i = 0; i < libros.length; i++) {
            if(libros[i] != null && libros[i].equals(libro)) {
                libro.recoger();
                libros[i] = null;
                break;
            }
        }
    }

    public  void listarLibros(){
        for(int i=0;i<libros.length;i++){
            if(libros[i] != null){
                System.out.println(libros[i]);
            }
        }
    }


    @Override
    public String toString() {
        return "Lector{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", libros=" + Arrays.toString(libros) +
                ", edad=" + edad +
                '}';
    }
}
