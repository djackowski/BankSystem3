package operations.interests;


public class LinearInterest implements Interest, LinearInterestConstants {
    public double calculate(double balance) {
        if (balance <= 0) {
            return NONE;
        } else if (balance > 0 && balance <= 1000) {
            return balance * MEDIUM;
        } else {
            return balance * HIGH;
        }
    }
}
