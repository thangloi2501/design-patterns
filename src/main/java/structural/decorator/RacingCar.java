package structural.decorator;

public class RacingCar extends CarDecorator {

    public RacingCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " Adding more more speed...";
    }
}
