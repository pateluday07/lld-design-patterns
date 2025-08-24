package patterns.creational.builder.outside.approach;

public class VehicleBuilder {

    private Engine engine;
    private int wheels;
    private VehicleType type;

   public VehicleBuilder engine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public VehicleBuilder wheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public VehicleBuilder type(VehicleType type) {
        this.type = type;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(engine, wheels, type);
    }

}
