package Factory;

public class TrickyAssignment extends Assignment{

    public TrickyAssignment() {
        this.getAssignment();
    }

    @Override
    void getAssignment() {
        System.out.print(" and gets a tricky assignment");
    }
}
