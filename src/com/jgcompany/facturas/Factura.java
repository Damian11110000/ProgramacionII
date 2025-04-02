package com.jgcompany.facturas;

import java.util.Arrays;
import java.util.Date;

public class Factura {

    private  Cliente cliente;

    private Integer folio;

    private String descripcion;

    private Date fecha;

    private ItemFactura [] items;

    private int indiceFactura;

    private final int NUM_ELEMENTOS = 2;

    public Factura(Cliente cliente, Integer folio, String descripcion, Date fecha) {
        this.cliente = cliente;
        this.folio = folio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.items = new ItemFactura[NUM_ELEMENTOS];
    }

    public Double calcularTotal(){
        Double total = 0.0;
        for (ItemFactura item : items){
            total += item.calcularImporte();
        }

        return total;
    }

    public String verDetalle(){

        return "Factura{" +
                "cliente=" + cliente +
                ", folio=" + folio +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", items=" + Arrays.toString(items) +
                '}';
    }


    public  void agregarItem(ItemFactura item){

            items[indiceFactura++] = item;
    }


    @Override
    public String toString() {
        return this.verDetalle();
    }
}
