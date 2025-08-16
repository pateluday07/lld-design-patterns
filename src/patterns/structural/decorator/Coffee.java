package patterns.structural.decorator;

public interface Coffee {

    String getDescription();

    double getCost();

    boolean isHot();

    void setHot(boolean hot);
}
