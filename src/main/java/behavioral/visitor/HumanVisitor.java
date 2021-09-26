package behavioral.visitor;

public class HumanVisitor implements Visitor {

    @Override
    public void visit(BookItem item) {
        System.out.println("Visit book item: " + item.getISBN());
    }

    @Override
    public void visit(GameItem item) {
        System.out.println("Visit game item: " + item.getGame());
    }
}
