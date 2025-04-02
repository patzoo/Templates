package Commands;

import Observers.IViewer;

public class OnlineViewer implements IViewer {
    private String name;

    public OnlineViewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String exercise) {
        System.out.println(name + " упражнява: " + exercise);
    }
}
