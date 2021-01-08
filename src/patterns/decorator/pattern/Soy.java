package patterns.decorator.pattern;

public class Soy extends CondimentDecorator {

    private static final double TALL_SOY_PRICE = 10.00;
    private static final double GRANDE_SOY_PRICE = 15.00;
    private static final double VENTI_SOY_PRICE = 20.00;

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(", Soy");
    }

    @Override
    public double cost() {
        if (beverage.size == Size.TALL) {
            return TALL_SOY_PRICE + beverage.cost();
        } else if (beverage.size == Size.GRANDE) {
            return GRANDE_SOY_PRICE + beverage.cost();
        } else {
            return VENTI_SOY_PRICE + beverage.cost();
        }
    }
}
