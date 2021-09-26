package behavioral.state;

public class HumanContext implements State{
    private State state;

    public HumanContext() {
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void doAction() {
        state.doAction();
    }
}
