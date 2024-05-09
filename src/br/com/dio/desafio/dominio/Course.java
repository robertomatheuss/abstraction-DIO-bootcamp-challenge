package br.com.dio.desafio.dominio;

public class Course extends Content {

    private Integer workload;

    public Course(String title, String description, Integer workload) {
        super(title, description);
        this.workload = workload;
    }

    @Override
    public double calculateXP() {
        return STANDARD_XP * workload;
    }

    @Override
    public String toString() {
        return "Course:" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + workload;
    }
}
