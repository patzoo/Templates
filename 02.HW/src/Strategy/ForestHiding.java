package Strategy;

import Factory.Egg;

public class ForestHiding implements HideStrategy {
    @Override
    public void hide(Egg egg) {
        System.out.println("Заека скрил " + egg + " яйце в гората.");
    }
} 