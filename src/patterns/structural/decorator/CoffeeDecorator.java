package patterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public boolean isHot() {
        return coffee.isHot();
    }

    @Override
    public void setHot(boolean hot) {
        coffee.setHot(hot);
    }
}
