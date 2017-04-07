package operations.interests;

import org.junit.Test;

import static operations.interests.RelativeInterestConstants.*;
import static org.junit.Assert.*;

public class RelativeInterestTest {
    private RelativeInterest relativeInterest = new RelativeInterest();

    @Test
    public void whenCalculate_withZeroBalance_shouldReturnNONE() throws Exception {
        //Given
        double balance = 0;
        //When
        double interest = relativeInterest.calculate(balance);
        //Then
        assertEquals(NONE, interest, 0.0);
    }


    @Test
    public void whenCalculate_withSubzeroBalance_shouldReturnNONE() throws Exception {
        //Given
        double balance = -100;
        //When
        double interest = relativeInterest.calculate(balance);
        //Then
        assertEquals(NONE, interest, 0.0);
    }

    @Test
    public void whenCalculate_withLowBalance_shouldReturnLowInterest() throws Exception {
        //Given
        double lowBalance = 100;
        //When
        double interest = relativeInterest.calculate(lowBalance);
        double expected = lowBalance * LOW;
        //Then
        assertEquals(expected, interest, 0.0);
    }

    @Test
    public void whenCalculate_withMediumBalance_shouldReturnMediumInterest() throws Exception {
        //Given
        double mediumBalance = 1100;
        //When
        double interest = relativeInterest.calculate(mediumBalance);
        double expected = mediumBalance * MEDIUM;
        //Then
        assertEquals(expected, interest, 0.0);
    }

    @Test
    public void whenCalculate_withHighBalance_shouldReturnHighInterest() throws Exception {
        //Given
        double highBalance = 1000000;
        //When
        double interest = relativeInterest.calculate(highBalance);
        double expected = highBalance * HIGH;
        //Then
        assertEquals(expected, interest, 0.0);
    }


}