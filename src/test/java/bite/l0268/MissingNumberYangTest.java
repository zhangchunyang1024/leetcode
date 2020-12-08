package bite.l0268;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberYangTest
{

    @Test
    public void missingNumber1()
    {
        MissingNumberYang missingNumberYang = new MissingNumberYang();
        assertEquals(2, missingNumberYang.missingNumber1(new int[]{3,0,1}));
        assertEquals(2, missingNumberYang.missingNumber1(new int[]{0,1}));
        assertEquals(8, missingNumberYang.missingNumber1(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, missingNumberYang.missingNumber1(new int[]{0}));
    }

    @Test
    public void missingNumber2()
    {
        MissingNumberYang missingNumberYang = new MissingNumberYang();
        assertEquals(2, missingNumberYang.missingNumber2(new int[]{3,0,1}));
        assertEquals(2, missingNumberYang.missingNumber2(new int[]{0,1}));
        assertEquals(8, missingNumberYang.missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, missingNumberYang.missingNumber2(new int[]{1}));

    }
}