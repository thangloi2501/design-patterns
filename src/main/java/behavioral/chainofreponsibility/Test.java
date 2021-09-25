package behavioral.chainofreponsibility;

public class Test {
    public static void main(String[] args) {
        Money money = new Money(75);

        WithdrawChain c1 = new Dollar50WithdrawChain();
        WithdrawChain c2 = new Dollar20WithdrawChain();
        WithdrawChain c3 = new Dollar10WithdrawChain();
        c1.setNextChain(c2);
        c2.setNextChain(c3);

        c1.withdraw(money);
    }
}
