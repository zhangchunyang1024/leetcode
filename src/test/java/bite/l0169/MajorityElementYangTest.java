package bite.l0169;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementYangTest
{

    @Test
    public void majorityElement()
    {
        int[] nums = new int[] {3, 2, 3};
        int i = new MajorityElementYang().majorityElement(nums);
        assertEquals(3, i);

        nums = new int[] {2, 2, 1, 1, 1, 2, 2};
        i = new MajorityElementYang().majorityElement(nums);
        assertEquals(2, i);

        nums = new int[] {2};
        i = new MajorityElementYang().majorityElement(nums);
        assertEquals(2, i);
    }
}
