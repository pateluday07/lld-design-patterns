package patterns.structural.decorator;

public class DecoratorTester {

    public static void main(String[] args) {
        Coffee coffee1 = new BasicCoffee();
        coffee1 = new MilkDecorator(coffee1);
        coffee1 = new SugarDecorator(coffee1);
        System.out.println(
            "Coffee1\n"+
            "Description: " + coffee1.getDescription() + ", Cost: " + coffee1.cost()
        );

        Coffee coffee2 = new BasicCoffee();
        coffee2 = new SugarDecorator(coffee2);
        System.out.println(
            "Coffee2\n" +
            "Description: " + coffee2.getDescription() + ", Cost: " + coffee2.cost()
        );
    }
}
