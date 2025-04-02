package Factory;

public class FamiliarAssignment extends Assignment{

    public FamiliarAssignment() {
        this.getAssignment();
    }

    @Override
    void getAssignment() {
        System.out.print(" and gets an familiar Assignment");
    }
}
