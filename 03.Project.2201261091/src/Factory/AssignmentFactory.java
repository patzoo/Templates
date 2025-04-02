package Factory;

public class AssignmentFactory {
    public static Assignment getAssignment(String assignment) {
        if (assignment.equals("Short")) {
            return new ShortAssignment();
        }
        if(assignment.equals("Familiar")) {
            return new FamiliarAssignment();
        }
        if(assignment.equals("Tricky")) {
            return new TrickyAssignment();
        }
        System.out.println();
        System.out.println(assignment + " is not a valid assignment");
        return null;
    }
}

