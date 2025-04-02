package Singleton;

import Decorator.Student;
import Decorator.Type;
import Decorator.Superpower;
import Factory.AssignmentFactory;

public class University {

    private static University instance;

    private University() {
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public Student getStudent(String name, Type type) {
        return new Student(name,type);
    }

    public void setAssignment(Student student,String assignment) {
        AssignmentFactory.getAssignment(assignment);
    }

    public Student setStudentSuperpower(Student student,String superpower) {
        student = new Superpower(student,superpower);
        student.getStudentDescription();
        return student;
    }
}