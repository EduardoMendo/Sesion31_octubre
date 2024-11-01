package org.efmb;


class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void imprimirInformacion() {
        String info = "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año: " + año;
        System.out.println(info);
    }
}

class Auto extends Vehiculo {
    private int numeroPuertas;

    // Constructor
    public Auto(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

class Moto extends Vehiculo {
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }
}

