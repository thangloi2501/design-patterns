package behavioral.chainofreponsibility;

public class Dollar50WithdrawChain implements WithdrawChain {
    private WithdrawChain chain;

    @Override
    public void setNextChain(WithdrawChain chain) {
        this.chain = chain;
    }

    @Override
    public void withdraw(Money money) {
        if (money.getAmount() >= 50) {
            System.out.println("Withdraw 50 dollars");
            money.withdraw(50);
            if (this.chain != null)
                this.chain.withdraw(money);

        } else {
            System.out.println("Not enough money to withdraw 50 dollars");
            System.out.println("Remaining: " + money.getAmount());
        }
    }
}
