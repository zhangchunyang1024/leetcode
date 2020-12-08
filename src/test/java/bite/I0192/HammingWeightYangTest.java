package bite.I0192;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammingWeightYangTest
{

    @Test
    public void hammingWeight()
    {
        HammingWeightYang hammingWeightYang = new HammingWeightYang();
        int i = hammingWeightYang.hammingWeight(11);
        assertEquals(3, i);
    }
}