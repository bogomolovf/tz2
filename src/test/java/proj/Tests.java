package proj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Tests 
{

    @Test
    public void testMin()
    {
        int[] numbers = {5, 6, 8, 7, 1};
        assertEquals(1, Operations._min(numbers));
    }
    @Test
    public void testMax() {
        int[] numbers = {5, 6, 8, 7, 1};
        assertEquals(8, Operations._max(numbers));
    }
    @Test
    public void testSum() {
        int[] numbers = {5, 6, 8, 7, 1};
        assertEquals(27, Operations._sum(numbers));
    }

    @Test
    public void testMult() {
        int[] numbers = {5, 6, 8, 7, 1};
        assertEquals(1680, Operations._mult(numbers));
    }

    @Test
    public void testOtrNums() {
        int[] numbers = {-5, -6, 8, -7, 1};
        assertEquals(-7, Operations._min(numbers));
        assertEquals(8, Operations._max(numbers));
        assertEquals(-9, Operations._sum(numbers));
        assertEquals(-1680, Operations._mult(numbers));
    }    

}
