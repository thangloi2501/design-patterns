package behavioral.templatemethod;

public  abstract class HouseTemplate {
    public final void buildHouse() {
        System.out.println("Starting......");
        buildRoot();
        buildDoor();
        buildWindow();
        buildFloor();
        System.out.println("Finished!!");
    }

    public void buildRoot() {
        System.out.println("Build basic root");
    }

    public abstract void buildDoor();
    public abstract void buildWindow();

    public void buildFloor() {
        System.out.println("Build basic floor");
    }
}
