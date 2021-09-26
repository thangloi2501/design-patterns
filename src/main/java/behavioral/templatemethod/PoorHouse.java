package behavioral.templatemethod;

public class PoorHouse extends HouseTemplate {
    @Override
    public void buildDoor() {
        System.out.println("Poor door");
    }

    @Override
    public void buildWindow() {
        System.out.println("Ugly windows");
    }
}
