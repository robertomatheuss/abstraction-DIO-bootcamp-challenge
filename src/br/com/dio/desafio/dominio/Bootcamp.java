package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate;
    private final LocalDate finaldate;
    private Set<Developer> devRegistered;
    private Set<Content> contents;

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
        this.initialDate = LocalDate.now();
        this.finaldate = initialDate.plusDays(45);
        this.devRegistered = new HashSet<>();
        this.contents = new LinkedHashSet<>();
    }

    public void addContents(Content content){
        this.contents.add(content);
    }

    public void addDeveloper(Developer developer){
        this.devRegistered.add(developer);
    }

    public Set<Content> getContents() {
        return contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finaldate, bootcamp.finaldate) && Objects.equals(devRegistered, bootcamp.devRegistered) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finaldate, devRegistered, contents);
    }
}
