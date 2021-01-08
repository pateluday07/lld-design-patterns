package patterns.decorator.pattern;

public class Espresso extends Beverage {

    private static final double TALL_ESPRESSO_PRICE = 3.44;
    private static final double GRANDE_ESPRESSO_PRICE = 5.12;
    private static final double VENTI_ESPRESSO_PRICE = 6.68;

    public Espresso(Size size) {
        this.size = size;
        description = "Espresso";
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return TALL_ESPRESSO_PRICE;
        } else if (size == Size.GRANDE) {
            return GRANDE_ESPRESSO_PRICE;
        } else {
            return VENTI_ESPRESSO_PRICE;
        }
    }
}
