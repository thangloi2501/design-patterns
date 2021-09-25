package behavioral.chainofreponsibility;

public interface WithdrawChain {
    void setNextChain(WithdrawChain chain);
    void withdraw(Money money);
}
