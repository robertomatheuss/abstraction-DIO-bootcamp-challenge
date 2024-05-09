package br.com.dio.desafio.dominio;

public abstract class Content {

    protected static final double STANDARD_XP = 10d;

    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double calculateXP();

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
