package bite.l0231;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPowerOfTwoTest
{

    @Test
    public void isPowerOfTwo()
    {
        IsPowerOfTwo isPowerOfTwo = new IsPowerOfTwo();
        boolean powerOfTwo = isPowerOfTwo.isPowerOfTwo(2);
        assertTrue(powerOfTwo);

        powerOfTwo = isPowerOfTwo.isPowerOfTwo(3);
        assertFalse(powerOfTwo);

        powerOfTwo = isPowerOfTwo.isPowerOfTwo(32);
        assertTrue(powerOfTwo);

        powerOfTwo = isPowerOfTwo.isPowerOfTwo(1231231231);
        assertFalse(powerOfTwo);


        powerOfTwo = isPowerOfTwo.isPowerOfTwo(0);
        assertFalse(powerOfTwo);

        powerOfTwo = isPowerOfTwo.isPowerOfTwo(-2);
        assertFalse(powerOfTwo);
    }
}