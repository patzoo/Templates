package Strategy;

import Factory.Egg;

public class BushHiding implements HideStrategy {
    @Override
    public void hide(Egg egg) {
        System.out.println("Заека скрил " + egg + " яйце под храст.");
    }
} 