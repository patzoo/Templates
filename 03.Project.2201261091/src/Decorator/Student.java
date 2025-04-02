package Decorator;

import ChainOfResponsibility.AssignmentStack;
import ChainOfResponsibility.KalitkoStack;
import ChainOfResponsibility.NerdStack;
import ChainOfResponsibility.TarikatStack;

public class Student {
    public String name;

    public Type type;


    public Student(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Student() {
    }

    public String getStudentDescription() {
        return this.name + " is a " + this.type;
    }

    public void giveAssignment() {
        if (this.type == Type.NERD) {
            AssignmentStack stack = new NerdStack();
            stack.sortAssignment(this.type,this.name + "'s test goes to the First stack");
        }
        else if (this.type == Type.TARIKAT) {
            AssignmentStack stack = new TarikatStack();
            stack.sortAssignment(this.type,this.name + "'s test goes to the Second stack");
        }
        else {
            AssignmentStack stack = new KalitkoStack();
            stack.sortAssignment(this.type,this.name + "'s test goes to the Third stack");
        }
    }
}
