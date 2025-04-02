package com.jgcompany.facturas;

public class ItemFactura {

    private Producto producto;

    private int cantidad;

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Double calcularImporte(){
            return  cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return "ItemFactura{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
