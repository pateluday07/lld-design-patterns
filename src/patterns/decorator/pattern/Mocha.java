package patterns.decorator.pattern;

public class Mocha extends CondimentDecorator {

    private static final double TALL_MOCHA_PRICE = 2.00;
    private static final double GRANDE_MOCHA_PRICE = 4.00;
    private static final double VENTI_MOCHA_PRICE = 6.00;

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(", Mocha");
    }

    @Override
    public double cost() {
        if (beverage.size == Size.TALL) {
            return TALL_MOCHA_PRICE + beverage.cost();
        } else if (beverage.size == Size.GRANDE) {
            return GRANDE_MOCHA_PRICE + beverage.cost();
        } else {
            return VENTI_MOCHA_PRICE + beverage.cost();
        }
    }
}
