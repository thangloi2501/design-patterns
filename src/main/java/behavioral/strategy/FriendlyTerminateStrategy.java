package behavioral.strategy;

public class FriendlyTerminateStrategy implements TerminateStrategy {
    private String name;
    private String toy;

    public FriendlyTerminateStrategy(String name, String toy) {
        this.name = name;
        this.toy = toy;
    }

    @Override
    public void kill(String victim) {
        System.out.println("My name is " + name + ". I am preparing toy: " + toy + " to kill him!!!");
        System.out.println("Laugh to die victim: " + victim);
    }
}
