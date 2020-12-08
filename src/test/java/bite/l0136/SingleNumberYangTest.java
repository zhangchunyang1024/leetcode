package bite.l0136;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberYangTest
{

    @Test
    public void onlyOne()
    {
        SingleNumberYang singleNumber = new SingleNumberYang();

        int[] arr = new int[] {4, 1, 2, 1, 2};
        int target = singleNumber.singleNumber(arr);
        Assert.assertEquals(4, target);

        arr = new int[] {2, 2, 1};
        target = singleNumber.singleNumber(arr);
        Assert.assertEquals(1, target);
    }
}
