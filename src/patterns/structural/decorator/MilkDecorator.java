package patterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {

    private double cost = 20.5; // Cost for milk

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
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
