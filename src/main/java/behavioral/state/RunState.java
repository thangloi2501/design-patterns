package behavioral.state;

public class RunState implements State {
    @Override
    public void doAction() {
        System.out.println("Running......");
    }
}
