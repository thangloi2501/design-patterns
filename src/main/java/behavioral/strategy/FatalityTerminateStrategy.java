package behavioral.strategy;

public class FatalityTerminateStrategy implements TerminateStrategy {
    private String name;
    private String hammer;

    public FatalityTerminateStrategy(String name, String hammer) {
        this.name = name;
        this.hammer = hammer;
    }

    @Override
    public void kill(String victim) {
        System.out.println("Hehe, go to hell, " + name + " is killing victim with hammer: " + hammer);
        System.out.println("Punch/Kick to die victim: " + victim);
    }
}
