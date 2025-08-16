package patterns.structural.decorator;

public class Espresso implements Coffee {

    private final double cost = 50;
    private boolean hot = true;

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public boolean isHot() {
        return hot;
    }

    @Override
    public void setHot(boolean hot) {
        this.hot = hot;
    }
}
