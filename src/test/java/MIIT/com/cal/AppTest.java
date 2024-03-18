package MIIT.com.cal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
   
	 @Test
	    public void testAddPositive() {
	        float result = Calculator.add(5, 3);
	        assertEquals(8, result, 0); // Expected result is 8
	    }

	    @Test
	    public void testSubPositive() {
	        float result = Calculator.sub(5, 3);
	        assertEquals(2, result, 0); // Expected result is 2
	    }

	    @Test
	    public void testMulPositive() {
	        float result = Calculator.mul(5, 3);
	        assertEquals(15, result, 0); // Expected result is 15
	    }

	    @Test
	    public void testDivByNonZeroPositive() {
	        float result = Calculator.div(10, 2);
	        assertEquals(5, result, 0); // Expected result is 5
	    }

	    @Test
	    public void testDivByZeroPositive() {
	        float result = Calculator.div(10, 0);
	        assertEquals(0, result, 0); // Expected result is 0
	        // You might want to add an assertion to check if the message "You Enter Zero" is printed to the console
	    }
	    
	    // Negative Testing Cases
	    
	    @Test
	    public void testAddNegative() {
	        float result = Calculator.add(-5, -3);
	        assertEquals(-8, result, 0); // Expected result is -8
	    }

	    @Test
	    public void testSubNegative() {
	        float result = Calculator.sub(-5, -3);
	        assertEquals(-2, result, 0); // Expected result is -2
	    }

	    @Test
	    public void testMulNegative() {
	        float result = Calculator.mul(-5, 3);
	        assertEquals(-15, result, 0); // Expected result is -15
	    }

	    @Test
	    public void testDivByNonZeroNegative() {
	        float result = Calculator.div(-10, 2);
	        assertEquals(-5, result, 0); // Expected result is -5
	    }

	    @Test
	    public void testDivByZeroNegative() {
	        float result = Calculator.div(-10, 0);
	        assertEquals(0, result, 0); // Expected result is 0
	        // You might want to add an assertion to check if the message "You Enter Zero" is printed to the console
	    }
	}


