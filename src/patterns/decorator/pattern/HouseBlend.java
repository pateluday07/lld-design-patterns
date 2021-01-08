package patterns.decorator.pattern;

public class HouseBlend extends Beverage {

    private static final double TALL_HOUSE_BLEND_PRICE = 2.58;
    private static final double GRANDE_HOUSE_BLEND_PRICE = 4.33;
    private static final double VENTI_HOUSE_BLEND_PRICE = 7.24;

    public HouseBlend(Size size) {
        this.size = size;
        description = "House Blend";
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return TALL_HOUSE_BLEND_PRICE;
        } else if (size == Size.GRANDE) {
            return GRANDE_HOUSE_BLEND_PRICE;
        } else {
            return VENTI_HOUSE_BLEND_PRICE;
        }
    }
}
