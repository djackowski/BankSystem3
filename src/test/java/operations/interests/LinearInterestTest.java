package operations.interests;

import org.junit.Test;

import static operations.interests.LinearInterestConstants.HIGH;
import static operations.interests.LinearInterestConstants.MEDIUM;
import static org.junit.Assert.*;

public class LinearInterestTest {
    private LinearInterest linearInterest = new LinearInterest();

    @Test
    public void whenCalculate_withZeroBalance_shouldReturnZero() throws Exception {
        //Given
        double balance = 0;
        //When
        double interest = linearInterest.calculate(balance);
        //Then
        assertEquals(0, interest, 0.0);
    }


    @Test
    public void whenCalculate_withSubzeroBalance_shouldReturnZero() throws Exception {
        //Given
        double balance = -100;
        //When
        double interest = linearInterest.calculate(balance);
        //Then
        assertEquals(0, interest, 0.0);
    }


    @Test
    public void whenCalculate_withMediumBalance_shouldReturnMediumInterest() throws Exception {
        //Given
        double mediumBalance = 100;
        //When
        double interest = linearInterest.calculate(mediumBalance);
        double expected = mediumBalance * MEDIUM;
        //Then
        assertEquals(expected, interest, 0.0);
    }

    @Test
    public void whenCalculate_withHighBalance_shouldReturnHighInterest() throws Exception {
        //Given
        double highBalance = 100000;
        //When
        double interest = linearInterest.calculate(highBalance);
        double expected = highBalance * HIGH;
        //Then
        assertEquals(expected, interest, 0.0);
    }

}