package models;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String Genre;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(Genre, person.Genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Genre);
    }

    public String obtenerDetalles() {
        return "Nombre: " + name + "\nEdad: " + age;
    }

}
