package patterns.decorator.pattern;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        //making double mocha soy latte with whip
        System.out.println("Making double mocha soy latte with whip");
        Beverage houseBlend = new HouseBlend(Size.GRANDE);
        CondimentDecorator houseBlendSoy = new Soy(houseBlend);
        CondimentDecorator houseBlendMochaOne = new Mocha(houseBlendSoy);
        CondimentDecorator houseBlendMochaTwo = new Mocha(houseBlendMochaOne);
        CondimentDecorator houseBlendWhip = new Whip(houseBlendMochaTwo);
        System.out.printf("Drink Name: %s%nTotal Cost: %.2f%n", houseBlendWhip.getDescription(), houseBlendWhip.cost());

        //making espresso only
        System.out.println("\nMaking Espresso");
        Beverage espressoOnly = new Espresso(Size.VENTI);
        System.out.printf("Drink Name: %s%nTotal Cost: %.2f%n", espressoOnly.getDescription(), espressoOnly.cost());

        //making Dark-Roast with double mocha and whip
        System.out.println("\nMaking Dark-roast");
        Beverage darkRoast = new DarkRoast(Size.TALL);
        CondimentDecorator darkRoastMochaOne = new Mocha(darkRoast);
        CondimentDecorator darkRoastMochaTwo = new Mocha(darkRoastMochaOne);
        CondimentDecorator darkRoastWhip = new Whip(darkRoastMochaTwo);
        System.out.printf("Drink Name: %s%nTotal Cost: %.2f%n", darkRoastWhip.getDescription(), darkRoastWhip.cost());

        System.out.println("\nMaking House-blend");
        Beverage houseBlendTwo = new HouseBlend(Size.VENTI);
        CondimentDecorator houseBlendTwoSoy = new Soy(houseBlendTwo);
        CondimentDecorator houseBlendTwoMocha = new Mocha(houseBlendTwoSoy);
        CondimentDecorator houseBlendTwoWhip = new Whip(houseBlendTwoMocha);
        System.out.printf("Drink Name: %s%nTotal Cost: %.2f%n", houseBlendTwoWhip.getDescription(), houseBlendTwoWhip.cost());

    }
}
