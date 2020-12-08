package bite.l0190;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitsYangTest
{

    @Test
    public void reverseBits()
    {
        ReverseBitsYang reverseBitsYang = new ReverseBitsYang();
        int i = reverseBitsYang.reverseBits(43261596);
        assertEquals(964176192, i);
    }
}