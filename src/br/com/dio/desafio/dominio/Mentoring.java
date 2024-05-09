package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate data;

    public Mentoring(String title, String description, LocalDate data) {
        super(title, description);
        this.data = data;
    }

    @Override
    public double calculateXP() {
        return STANDARD_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: " +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data=" + data;
    }
}
