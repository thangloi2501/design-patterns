package behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Item bookItem = new BookItem("aa", "isbn");
        Item gameItem = new GameItem("bb", "game");

        List<Item> items = Arrays.asList(bookItem, gameItem);

        Visitor visitor = new HumanVisitor();

        items.forEach(item -> item.accept(visitor));
    }
}
