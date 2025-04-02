package Factory;

public class EggFactory {
    public static Egg createEgg(String type) {
        switch (type) {
            case "кокоши":
                return new ChickenEgg();
            case "щраусови":
                return new OstrichEgg();
            case "динозавърски":
                return new DinosaurEgg();
            default:
                return null;
        }
    }
} 