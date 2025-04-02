package Decorator;

public class StudentDeco extends Student {
    protected Student decoratedStudent;

    public StudentDeco(Student decoratedStudent) {
        super();
        this.decoratedStudent = decoratedStudent;
    }
}
