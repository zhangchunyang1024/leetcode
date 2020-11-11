package bite;

import bite.l0136.Bit136Yang;
import org.junit.Assert;
import org.junit.Test;

public class Bit136YangTest
{

    @Test
    public void onlyOne()
    {
        Bit136Yang bitYang136 = new Bit136Yang();

        int[] arr = new int[]{4,1,2,1,2};
        int target = bitYang136.onlyOne(arr);
        Assert.assertEquals(4,target);

        arr = new int[]{2,2,1};
        target = bitYang136.onlyOne(arr);
        Assert.assertEquals(1,target);
    }
}