package Decorator;

import Factory.Egg;

public class StickerEgg extends EggDecorator {
    public StickerEgg(Egg egg) {
        super(egg);
        decoration = "облепялоно";
    }
} 