package patterns.decorator.pattern;

public class Whip extends CondimentDecorator {

    private static final double TALL_WHIP_PRICE = 3.00;
    private static final double GRANDE_WHIP_PRICE = 6.00;
    private static final double VENTI_WHIP_PRICE = 9.00;

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(", Whip");
    }

    @Override
    public double cost() {
        if (beverage.size == Size.TALL) {
            return TALL_WHIP_PRICE + beverage.cost();
        } else if (beverage.size == Size.GRANDE) {
            return GRANDE_WHIP_PRICE + beverage.cost();
        } else {
            return VENTI_WHIP_PRICE + beverage.cost();
        }
    }
}
