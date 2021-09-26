package behavioral.visitor;

public class BookItem implements Item {
    private String name;
    private String ISBN;

    public BookItem(String name, String ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
