package bite.l0268;

/**
 * @description:
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * 进阶：
 *      你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 *  
 * 示例 1：
 *      输入：nums = [3,0,1]
 *      输出：2
 *      解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。
 *          2 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 示例 2：
 *      输入：nums = [0,1]
 *      输出：2
 *      解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。
 *      2 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 示例 3：
 *      输入：nums = [9,6,4,2,3,5,7,0,1]
 *      输出：8
 *      解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。
 *          8 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 示例 4：
 *      输入：nums = [0]
 *      输出：1
 *      解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。
 *          1 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/missing-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: yangyangyang
 * @create: 2020-12-04 16:25
 **/
public class MissingNumberYang
{
    /**
     * 高斯求和等式实现
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums) {
        int n = nums.length;
        /**
         * 1. 数组中的最大元素的值n即为数组长度
         * 2. 计算0~n的高斯和是：n * (n + 1)/2
         */
        int sum = n * (n + 1)/2;

        /**
         * 0~n的高斯和 减去数组中实际存在的元素 的结果 即为 丢失的元素
         */
        for (int num : nums) {
            sum -= num;
        }

        return sum;
    }

    /**
     * 位运算中的异或实现
     * @param nums
     * @return
     */
    public int missingNumber2(int[] nums) {
        int length = nums.length;
        int result = 0;

        /**
         * 1.使用位运算中的异或(^)的运算规律
         *      1. a ^ a = 0
         *      2. 0 ^ a = a
         *      3. a ^ b ^ c = a ^ (b ^ c)
         * 2.数组中的最大元素的值n即为数组长度
         * 3.数组中的所有元素做异或 然后 再和从0到n的每个元素做异或，
         *   则最终是从0到n的每个元素做了2次异或(遍历数组中的每个元素做了一次，从0到n的每个元素做异或做第2次)，除了丢失的那个
         *
         */
        for (int i = 0; i < length; i++) {
            result = result ^ i ^ nums[i];
        }
        return result ^ length;
    }
}
