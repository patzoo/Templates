package Singleton;

import Factory.Egg;
import Strategy.HideStrategy;

public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny() {}

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public void hideEgg(Egg egg, HideStrategy hideStrategy) {
        hideStrategy.hide(egg);
    }
}