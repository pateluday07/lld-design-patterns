package patterns.decorator.pattern;

public class Milk extends CondimentDecorator {

    private static final double TALL_MILK_PRICE = 1.00;
    private static final double GRANDE_MILK_PRICE = 2.00;
    private static final double VENTI_MILK_PRICE = 3.00;

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.size == Size.TALL) {
            return TALL_MILK_PRICE + beverage.cost();
        } else if (beverage.size == Size.GRANDE) {
            return GRANDE_MILK_PRICE + beverage.cost();
        } else {
            return VENTI_MILK_PRICE + beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(", Milk");
    }
}
