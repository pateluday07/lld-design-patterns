package patterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {

    private final double cost = 5.0; // Cost for sugar

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + cost;
    }

}
