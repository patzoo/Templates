package Decorator;

public class Superpower extends StudentDeco {
    public String superpower;

    public Superpower(Student decoratedStudent, String superpower) {
        super(decoratedStudent);
        this.superpower = superpower;
        System.out.println(" and gets " + superpower);
    }
}
