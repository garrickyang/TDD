package yang;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void give3_thenFizz() {
        assertEquals("Fizz", FizzBuzz.transfer(3));
    }

    @Test
    public void give5_thenBuzz() {
        assertEquals("Buzz", FizzBuzz.transfer(5));
    }

    @Test
    public void give15_thenFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.transfer(15));
    }

    @Test
    public void give11_then11(){
        assertEquals(11+"", FizzBuzz.transfer(11));
    }
}

