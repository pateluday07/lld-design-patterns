package patterns.creational.builder.inner.approach;

public class HouserBuilderTester {

    public static void main(String[] args) {
        House luxuriousHouse = new House.HouseBuilder()
                .walls("Brick Walls")
                .doors("Wooden Doors")
                .windows("Glass Windows")
                .garden("Beautiful Garden")
                .swimmingPool("Large Swimming Pool")
                .build();
        System.out.println("Luxurious " + luxuriousHouse + "\n");

        House simpleHouse = new House.HouseBuilder()
                .walls("Concrete Walls")
                .doors("Metal Doors")
                .windows("Plastic Windows")
                .build();
        System.out.println("Simple " + simpleHouse);
    }
}
