package behavioral.state;

public class JumpState implements State {
    @Override
    public void doAction() {
        System.out.println("Jumping......");
    }
}
