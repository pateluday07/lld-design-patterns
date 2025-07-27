package patterns.structural.decorator;

public class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double cost() {
        return 40.0; // Base price for basic coffee
    }

}
