package org.efmb;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Harley-Davidson", "Sportster", 2018, false);

        auto.imprimirInformacion();
        moto.imprimirInformacion();
    }
}
