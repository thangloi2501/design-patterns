package behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        HouseTemplate house = new LuxuryHouse();
        house.buildHouse();

        house = new PoorHouse();
        house.buildHouse();
    }
}
