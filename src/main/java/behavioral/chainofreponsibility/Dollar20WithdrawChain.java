package behavioral.chainofreponsibility;

public class Dollar20WithdrawChain implements WithdrawChain {
    private WithdrawChain chain;

    @Override
    public void setNextChain(WithdrawChain chain) {
        this.chain = chain;
    }

    @Override
    public void withdraw(Money money) {
        if (money.getAmount() >= 20) {
            System.out.println("Withdraw 20 dollars");
            money.withdraw(20);
            if (this.chain != null)
                this.chain.withdraw(money);

        } else {
            System.out.println("Not enough money to withdraw 20 dollars");
            System.out.println("Remaining: " + money.getAmount());
        }
    }
}
