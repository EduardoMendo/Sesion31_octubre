package org.efmb;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor
    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void actualizarCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidadDisponible = cantidad;
        } else {
            System.out.println("Error: La cantidad no puede ser negativa.");
        }
    }

    public double calcularValorTotal() {
        return precio * cantidadDisponible;
    }

    public void mostrarInformacion() {
        String info = "Nombre: " + nombre + "\n" +
                "Precio: $" + precio + "\n" +
                "Cantidad Disponible: " + cantidadDisponible + "\n" +
                "Valor Total: $" + calcularValorTotal();
        System.out.println(info);
    }

    public static void main(String[] args) {
        Producto producto = new Producto("Balon", 500.0, 3);
        producto.mostrarInformacion();

        producto.actualizarCantidad(30);
        producto.mostrarInformacion();
    }
}

