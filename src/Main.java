import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Course Java","Full course java",8);
        Course c2 = new Course("Course JS","Full Course JS",4);
        Mentoring men = new Mentoring("Mentoring of java","Mentoring java",LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Description Bootcamp Java Developer");
        bootcamp.addContents(c1);
        bootcamp.addContents(c2);
        bootcamp.addContents(men);

        Developer devCamila = new Developer("Camila");
        devCamila.registerBootcamp(bootcamp);

        System.out.println("Camila's registered content before advance:" );
        devCamila.getRegisteredContents().forEach(x-> System.out.println("   "+x));
        devCamila.advanceContent();
        devCamila.advanceContent();

        System.out.println("--------");

        System.out.println("Camila's registered content after advance:");
        devCamila.getRegisteredContents().forEach(x-> System.out.println("   "+x));

        System.out.println("Completed Contents Camila:");
        devCamila.getCompletedContents().forEach(x-> System.out.println("   "+x));

        System.out.println("Camila's XP: " + devCamila.calculateTotalXp());

        System.out.println("--------");

        Developer devJoao = new Developer("João");
        devJoao.registerBootcamp(bootcamp);

        System.out.println("João's registered content before advance:" );
        devJoao.getRegisteredContents().forEach(x-> System.out.println("   "+x));
        devJoao.advanceContent();
        devJoao.advanceContent();
        devJoao.advanceContent();

        System.out.println("--------");

        System.out.println("João's registered content after advance:");
        devJoao.getRegisteredContents().forEach(x-> System.out.println("   "+x));

        System.out.println("Completed Contents João:");
        devJoao.getCompletedContents().forEach(x-> System.out.println("   "+x));

        System.out.println("João's XP: " + devJoao.calculateTotalXp());

    }

}
