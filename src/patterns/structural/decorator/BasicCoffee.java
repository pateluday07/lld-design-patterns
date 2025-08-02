package patterns.structural.decorator;

public class BasicCoffee implements Coffee {

    private double cost = 40.0; // Base price for basic coffee

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }


}
