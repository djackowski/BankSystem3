package operations;


import products.Account;

public class InterestOperation extends Operation {
    private InterestMechanism interestMechanism;

    public InterestOperation(Account account) {
        super(account);
    }

    public double calculate(int amount) {
        double interest;
        switch (interestMechanism) {
            case ACCOUNT:
                interest = amount * 0.04;
                break;
            case CREDIT:
                interest = amount * 0.06;
                break;
            case INVESTMENT:
                interest = amount * 0.08;
                break;
            default:
                interest = amount * 0.02;
                break;
        }
        account.getHistory().add("Interest operation calculated: " + interest);
        return interest;
    }

    public void setInterestMechanism(InterestMechanism interestMechanism) {
        this.interestMechanism = interestMechanism;
    }
}
