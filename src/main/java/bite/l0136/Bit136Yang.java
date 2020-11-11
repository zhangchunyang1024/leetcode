package bite.l0136;

/**
 * @description: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * @author: yangyangyang
 * @create: 2020-11-11 16:06
 **/
public class Bit136Yang
{
    /**
     * 使用 异或 运算符的特性：
     * 1. a ^ a = 0
     * 2. a ^ b = b ^ a, a ^ b ^ c = b ^ a ^ c
     * 3. a ^ 0 = a
     *
     * 由以上可以得出：
     *      a ^ b ^ b ^ c ^ c = a // 且结果和等式左边参与计算的元素的顺序无关
     */
    public int onlyOne(int[] arrs)
    {
        int result = 0;
        for (int i = 0; i < arrs.length; i++) {
            result ^= arrs[i];
        }

        return result;
    }
}
