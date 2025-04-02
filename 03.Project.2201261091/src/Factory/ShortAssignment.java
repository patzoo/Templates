package Factory;

public class ShortAssignment extends Assignment{

    public ShortAssignment() {
        this.getAssignment();
    }

    @Override
    void getAssignment() {
        System.out.print(" and gets a short assignment");
    }
}
