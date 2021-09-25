package structural.decorator;

public class Test {
    public static void main(String[] args) {
        NormalCar car = new NormalCar();

        ToyCar toyCar = new ToyCar(car);
        RacingCar racingCar = new RacingCar(car);

        System.out.println(toyCar.assemble());
        System.out.println(racingCar.assemble());
    }
}
