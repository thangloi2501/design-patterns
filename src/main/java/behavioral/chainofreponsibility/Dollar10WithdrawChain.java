package behavioral.chainofreponsibility;

public class Dollar10WithdrawChain implements WithdrawChain {
    private WithdrawChain chain;

    @Override
    public void setNextChain(WithdrawChain chain) {
        this.chain = chain;
    }

    @Override
    public void withdraw(Money money) {
        if (money.getAmount() >= 10) {
            System.out.println("Withdraw 10 dollars");
            money.withdraw(10);
            if (this.chain != null)
                this.chain.withdraw(money);
        } else {
            System.out.println("Not enough money to withdraw 10 dollars");
            System.out.println("Remaining: " + money.getAmount());
        }
    }
}
