package patterns.decorator.pattern;

public class Decaf extends Beverage{

    private static final double TALL_DECAF_PRICE = 1.44;
    private static final double GRANDE_DECAF_PRICE = 4.12;
    private static final double VENTI_DECAF_PRICE = 5.68;

    public Decaf(Size size){
        this.size = size;
        description = "Decaf";
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return TALL_DECAF_PRICE;
        } else if (size == Size.GRANDE) {
            return GRANDE_DECAF_PRICE;
        } else {
            return VENTI_DECAF_PRICE;
        }
    }
}
