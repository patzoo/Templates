package Observers;

public interface ITrainee {
    void attach(IViewer viewer);
    void notify(String exercise);
}
