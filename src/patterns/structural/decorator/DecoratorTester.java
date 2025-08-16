package patterns.structural.decorator;

public class DecoratorTester {

    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println("Basic Coffee: " + basicCoffee.getDescription() + ", Cost: " + basicCoffee.getCost() + ", Hot: " + basicCoffee.isHot());

        Coffee espresso = new Espresso();
        System.out.println("Espresso: " + espresso.getDescription() + ", Cost: " + espresso.getCost() + ", Hot: " + espresso.isHot());

        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println("Milk Coffee: " + milkCoffee.getDescription() + ", Cost: " + milkCoffee.getCost() + ", Hot: " + milkCoffee.isHot());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Sugar Milk Coffee: " + sugarMilkCoffee.getDescription() +
                ", Cost: " + sugarMilkCoffee.getCost() +
                ", Hot: " + sugarMilkCoffee.isHot());

        // Testing hot coffee
        sugarMilkCoffee.setHot(false);
        System.out.println("Sugar Milk Coffee after setting hot to false: " + sugarMilkCoffee.getDescription() +
                ", Cost: " + sugarMilkCoffee.getCost() +
                ", Hot: " + sugarMilkCoffee.isHot());

        // Decorating Espresso with Milk and Sugar
        Coffee espressoWithMilk = new MilkDecorator(espresso);
        System.out.println("Espresso with Milk: " + espressoWithMilk.getDescription() +
                ", Cost: " + espressoWithMilk.getCost() +
                ", Hot: " + espressoWithMilk.isHot());
        Coffee espressoWithMilkAndSugar = new SugarDecorator(espressoWithMilk);
        System.out.println("Espresso with Milk and Sugar: " + espressoWithMilkAndSugar.getDescription() +
                ", Cost: " + espressoWithMilkAndSugar.getCost() +
                ", Hot: " + espressoWithMilkAndSugar.isHot());
    }

}
