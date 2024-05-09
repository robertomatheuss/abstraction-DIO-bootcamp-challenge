package br.com.dio.desafio.dominio;

import java.util.*;

public class Developer {
    private String name;
    private Set<Content> registeredContents;
    private Set<Content> completedContents;

    public Developer(String name) {
        this.name = name;
        this.registeredContents = new LinkedHashSet<>();
        this.completedContents = new LinkedHashSet<>();
    }

    public void registerBootcamp(Bootcamp bootcamp){
        this.registeredContents.addAll(bootcamp.getContents());
        bootcamp.addDeveloper(this);
    }

    public void advanceContent() {
        Optional<Content> content = this.registeredContents.stream().findFirst();
        if(content.isPresent()) {
            this.completedContents.add(content.get());
            this.registeredContents.remove(content.get());
        } else {
            throw new RuntimeException("You are not enrolled in any content!");
        }
    }

    public double calculateTotalXp() {
        return this.completedContents
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }

    public Set<Content> getRegisteredContents() {
        return registeredContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer dev = (Developer) o;
        return Objects.equals(name, dev.name) && Objects.equals(registeredContents, dev.registeredContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registeredContents, completedContents);
    }
}
