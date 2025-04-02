package OnFitLine;

import Commands.*;

public class Main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        OnlineViewer viewer1 = new OnlineViewer("Зрител 1");
        OnlineViewer viewer2 = new OnlineViewer("Зрител 2");
        OnlineViewer viewer3 = new OnlineViewer("Зрител 3");

        trainee.attach(viewer1);
        trainee.attach(viewer2);
        trainee.attach(viewer3);

        FitnessInstructor instructor = new FitnessInstructor();

        IExercise sitDown = new Exercise(trainee, "Down");
        IExercise standUp = new Exercise(trainee, "Up");

        instructor.setCommand(sitDown);
        instructor.startExercise();

        instructor.setCommand(standUp);
        instructor.startExercise();
    }
}