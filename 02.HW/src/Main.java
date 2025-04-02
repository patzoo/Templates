import Decorator.ColoredEgg;
import Decorator.StickerEgg;
import Factory.Egg;
import Factory.EggFactory;
import Singleton.EasterBunny;
import Strategy.BasketHiding;
import Strategy.BushHiding;
import Strategy.ForestHiding;
import Strategy.HideStrategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EasterBunny bunny = EasterBunny.getInstance();
        Random random = new Random();
        String[] eggTypes = {"кокоши", "щраусови", "динозавърски"};
        HideStrategy[] hidingStrategies = {new BasketHiding(), new ForestHiding(), new BushHiding()};

        for (int i = 0; i < 8; i++) {
            Egg egg = EggFactory.createEgg(eggTypes[random.nextInt(eggTypes.length)]);

            if (random.nextInt(2) == 0) {
                egg = new ColoredEgg(egg);
            } else {
                egg = new StickerEgg(egg);
            }

            HideStrategy hidingStrategy = hidingStrategies[random.nextInt(hidingStrategies.length)];

            bunny.hideEgg(egg, hidingStrategy);
        }
    }
}