package patterns.creational.builder.outside.approach;

public class VehicleBuilderTester {

    public static void main(String[] args) {
        Vehicle car = new VehicleBuilder()
                .engine(Engine.PETROL)
                .wheels(4)
                .type(VehicleType.CAR)
                .build();
        System.out.println("Car " + car+"\n");

        Vehicle truck = new VehicleBuilder()
                .engine(Engine.DIESEL)
                .wheels(6)
                .type(VehicleType.TRUCK)
                .build();
        System.out.println("Truck " + truck+"\n");

        Vehicle motorcycle = new VehicleBuilder()
                .engine(Engine.ELECTRIC)
                .wheels(2)
                .type(VehicleType.MOTORCYCLE)
                .build();
        System.out.println("Motorcycle " + motorcycle);
    }
}
