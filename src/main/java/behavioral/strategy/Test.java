package behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> victims = Arrays.asList("v1", "v2");

        Prison prison = new Prison(victims);

        prison.terminateAllWithStrategy(new FriendlyTerminateStrategy("Loi", "car"));

        prison.terminateAllWithStrategy(new FatalityTerminateStrategy("Tuan", "BIG HAMMER"));
    }
}
