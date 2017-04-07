package operations.interests;

public class RelativeInterest implements Interest, RelativeInterestConstants {
    public double calculate(double balance) {
        if (balance <= 0) {
            return NONE;
        } else if (balance > 0 && balance <= 1000) {
            return balance * LOW;
        } else if (balance > 1000 && balance <= 10000) {
            return balance * MEDIUM;
        } else {
            return balance * HIGH;
        }
    }
}
