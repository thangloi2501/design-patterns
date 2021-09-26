package behavioral.visitor;

public interface Visitor {
    void visit(BookItem item);
    void visit(GameItem item);
}
