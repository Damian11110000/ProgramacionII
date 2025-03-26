package com.jgcompany;

public enum GeneroLibros {

    TERROR("terror",4),
    COMEDIA("comedia",1),
    SUSPENSO("suspenso",3),
    ROMANSE("romanse",2);

    private final String genero;
    private final int clasificacion;

    GeneroLibros(String genero,int clasificacion){
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    public String getGenero(){
        return genero;
    }

    public int getClasificacion(){
        return clasificacion;
    }
}
