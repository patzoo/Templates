package Decorator;

import Factory.Egg;

public class ColoredEgg extends EggDecorator {
    public ColoredEgg(Egg egg) {
        super(egg);
        decoration = "оцветено";
    }
} 