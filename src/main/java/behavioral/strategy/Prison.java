package behavioral.strategy;

import java.util.List;

public class Prison {
    private List<String> victims;

    public Prison(List<String> victims) {
        this.victims = victims;
    }

    public void terminateAllWithStrategy(TerminateStrategy strategy) {
        victims.forEach(strategy::kill);
    }
}
