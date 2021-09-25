package structural.adapter;

public class DogAdapterImpl implements DogAdapter {
    private Dog dog;

    public DogAdapterImpl(Dog dog) {
        this.dog = dog;
    }

    public String say() {
        return this.translateToHumanSpeech(dog.say());
    }

    private String translateToHumanSpeech(String dogSaid) {
        return "The dog said: " + dogSaid + " means hehe!!!!";
    }
}
