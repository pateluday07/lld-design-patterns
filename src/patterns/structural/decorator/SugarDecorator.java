package patterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {

    private double cost = 5.0; // Cost for sugar

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }


}
