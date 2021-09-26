package behavioral.templatemethod;

public class LuxuryHouse extends HouseTemplate {
    @Override
    public void buildDoor() {
        System.out.println("Build luxury doooooooooor");
    }

    @Override
    public void buildWindow() {
        System.out.println("Build beautiful WINDOWSSSSSSSSSSSSSSSSSSS");
    }

    @Override
    public void buildRoot() {
        System.out.println("Fix cai root luon cho xin");
    }
}
