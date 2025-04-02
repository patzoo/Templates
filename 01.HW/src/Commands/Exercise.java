package Commands;

import OnFitLine.Trainee;

public class Exercise implements IExercise {
    private Trainee trainee;
    private String exercise;

    public Exercise(Trainee trainee, String exercise) {
        this.trainee = trainee;
        this.exercise = exercise;
    }

    @Override
    public void execute() {
        trainee.performExercise(exercise);
    }
}
