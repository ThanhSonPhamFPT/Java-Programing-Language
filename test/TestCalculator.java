import com.arthur.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testAddition(){
        Calculator c1 = new Calculator(2, 3);
        assertEquals(5, c1.addition());
    }
    @Test
    public void testMultiply(){
        Calculator c2 = new Calculator(2,3);
        assertEquals(6,c2.multiply());
    }
    @Test
    public void testMultiplyByZero(){
        Calculator c2 = new Calculator(0,3);
        assertEquals(0,c2.multiply());
    }
}
