package patterns.decorator.pattern;

public class DarkRoast extends Beverage {

    private static final double TALL_DARK_ROAST_PRICE = 1.58;
    private static final double GRANDE_DARK_ROAST_PRICE = 4.64;
    private static final double VENTI_DARK_ROAST_PRICE = 5.55;

    public DarkRoast(Size size) {
        this.size = size;
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return TALL_DARK_ROAST_PRICE;
        } else if (size == Size.GRANDE) {
            return GRANDE_DARK_ROAST_PRICE;
        } else {
            return VENTI_DARK_ROAST_PRICE;
        }
    }
}
