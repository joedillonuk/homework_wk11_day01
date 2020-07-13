import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    public void canMultiply(){
        assertEquals(12, calculator.multiply(6, 2));
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.divide(10, 2), 0.01);
    }


}
