package Decorator;

import Factory.Egg;

public abstract class EggDecorator extends Egg {
    protected Egg egg;
    protected String decoration;

    public EggDecorator(Egg egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return decoration + " " + egg.toString();
    }
}