package OnFitLine;

import Observers.IViewer;
import Observers.ITrainee;
import java.util.ArrayList;
import java.util.List;

public class Trainee implements ITrainee {
    private List<IViewer> viewers = new ArrayList<>();
    private String exercise;

    @Override
    public void attach(IViewer viewer) {
        viewers.add(viewer);
    }

    @Override
    public void notify(String exercise) {
        for (IViewer viewer : viewers) {
            viewer.update(exercise);
        }
    }

    public void performExercise(String exercise) {
        this.exercise = exercise;
        System.out.println("Трениращ прави упражнение: " + exercise);
        notify(exercise);
    }
}
