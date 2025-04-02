import ChainOfResponsibility.KalitkoStack;
import ChainOfResponsibility.NerdStack;
import ChainOfResponsibility.TarikatStack;
import Decorator.Student;
import Decorator.Type;
import Singleton.University;

public class Main {
    public static void main(String[] args) {
        University university = University.getInstance();

        Student pazzo = university.getStudent("Pazzo", Type.NERD);
        System.out.print(pazzo.getStudentDescription());
        university.setAssignment(pazzo,"Tricky");
        university.setStudentSuperpower(pazzo,"Infrared vision");
        pazzo.giveAssignment();

        Student petko = university.getStudent("Petko", Type.TARIKAT);
        System.out.print(petko.getStudentDescription());
        university.setAssignment(petko,"Short");
        university.setStudentSuperpower(petko,"Telepathy");
        petko.giveAssignment();

        Student bonka = university.getStudent("Bonka", Type.KALITKO);
        System.out.print(bonka.getStudentDescription());
        university.setAssignment(bonka,"Familiar");
        university.setStudentSuperpower(bonka,"Sharingan");
        bonka.giveAssignment();

        TarikatStack tarikatStack = new TarikatStack();
        NerdStack nerdStack = new NerdStack();
        KalitkoStack kalitkoStack = new KalitkoStack();
        tarikatStack.setNextStack(nerdStack);
        nerdStack.setNextStack(kalitkoStack);

        tarikatStack.sortAssignment(bonka.type, "All");

    }
}
