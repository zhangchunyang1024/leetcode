package bite.l0342;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPowerOfFourYangTest
{

    @Test
    public void isPowerOfFour()
    {
        IsPowerOfFourYang isPowerOfFourYang = new IsPowerOfFourYang();
        assertFalse(isPowerOfFourYang.isPowerOfFour(-2147483648));
        assertFalse(isPowerOfFourYang.isPowerOfFour(0));
        assertTrue(isPowerOfFourYang.isPowerOfFour(1));
        assertTrue(isPowerOfFourYang.isPowerOfFour(16));
    }
}