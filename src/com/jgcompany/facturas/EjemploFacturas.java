package com.jgcompany.facturas;

import java.util.Date;

public class EjemploFacturas {

    public static void main(String[] args) {


        Cliente cliente = new Cliente("Luis","12345678");

        Factura factura = new Factura(cliente,1,"Productos del hogar",new Date());

        Producto producto = new Producto("coca cola 1 lt","123",123.5);
        Producto producto2 = new Producto("coca cola 2lt","124",10.5);





        factura.agregarItem(new ItemFactura(producto,4));
        factura.agregarItem(new ItemFactura(producto2,5));

        System.out.println(factura.calcularTotal());
        System.out.println(factura.verDetalle());

    }
}
