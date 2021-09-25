package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private String name;
    private List<String> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public Zoo(String name, List<String> animals) {
        this.name = name;
        this.animals = animals;
    }

    @Override
    public Zoo clone() {
        return new Zoo(this.name, this.animals.stream()
                                              .map(String::new)
                                              .collect(Collectors.toList()));
    }
}
