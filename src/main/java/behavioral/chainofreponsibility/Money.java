package behavioral.chainofreponsibility;

public class Money {
    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public void withdraw(int amount) {
        this.amount = this.amount - amount;
    }

    public int getAmount() {
        return amount;
    }
}
