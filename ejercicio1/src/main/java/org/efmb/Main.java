package org.efmb;

import models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Eduardo Mendoza");
        person.setAge(18);
        person.setGenre("Hombre");

        System.out.println(person.obtenerDetalles());    }
}