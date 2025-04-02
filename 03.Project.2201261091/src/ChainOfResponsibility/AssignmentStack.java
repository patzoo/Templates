package ChainOfResponsibility;

import Decorator.Type;

public abstract class AssignmentStack {
    protected AssignmentStack nextStack;

    public void setNextStack(AssignmentStack nextStack) {
        this.nextStack = nextStack;
    }


    public AssignmentStack() {}

    public void sortAssignment(Type type, String message) {

        if (canHandle(type)) {
            System.out.println(" His test goes to stack " + getClass().getSimpleName());
            return;
        }
        else if (this.nextStack != null) {
            this.nextStack.sortAssignment(type,message);
            return;
        }
        System.err.println("Cannot sort assignment!");
    }

    abstract protected boolean canHandle(Type type);
}