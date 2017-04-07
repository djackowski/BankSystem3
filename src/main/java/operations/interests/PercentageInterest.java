package operations.interests;

public class PercentageInterest implements Interest, PercentageInterestConstants {

    public double calculate(double balance) {
        if (balance <= 0) {
            return NONE;
        } else if (balance > 0 && balance <= 10000) {
            return balance * LOW;
        } else if (balance > 10000 && balance <= 1000000) {
            return balance * MEDIUM;
        } else {
            return balance * HIGH;
        }
    }
}
