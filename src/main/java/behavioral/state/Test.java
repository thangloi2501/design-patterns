package behavioral.state;

public class Test {
    public static void main(String[] args) {
        HumanContext human = new HumanContext();

        human.setState(new JumpState());
        human.doAction();

        human.setState(new RunState());
        human.doAction();
    }
}
