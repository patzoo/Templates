package Commands;

public class FitnessInstructor {
    private IExercise exercise;

    public void setCommand(IExercise exercise) {
        this.exercise = exercise;
    }

    public void startExercise() {
        exercise.execute();
    }
}
