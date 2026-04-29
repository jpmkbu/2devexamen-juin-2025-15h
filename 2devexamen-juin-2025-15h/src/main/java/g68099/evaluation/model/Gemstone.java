package g68099.evaluation.model;

public enum Gemstone {
    DIAMOND(5000), RUBY(3000), SAPPHIRE(2500), EMERALD(4000), TOPAZ(800),
    AMETHYST(500), OPAL(1200), TURQUOISE(900);

    private int value;

    Gemstone(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
