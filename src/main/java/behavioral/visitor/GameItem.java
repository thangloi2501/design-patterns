package behavioral.visitor;

public class GameItem implements Item {
    private String name;
    private String game;

    public GameItem(String name, String game) {
        this.name = name;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
