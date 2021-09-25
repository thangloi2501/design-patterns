package structural.decorator;

public class ToyCar extends CarDecorator {

    public ToyCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " Adding sound and lights";
    }
}
