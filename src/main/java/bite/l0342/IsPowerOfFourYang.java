package bite.l0342;

/**
 * @description:
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。
 * 如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 * 示例 1：
 *      输入：n = 16
 *      输出：true
 *
 * 示例 2：
 *      输入：n = 5
 *      输出：false
 *
 * 示例 3：
 *      输入：n = 1
 *      输出：true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-four
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: yangyangyang
 * @create: 2020-12-04 17:31
 **/
public class IsPowerOfFourYang
{

    public boolean isPowerOfFour(int n) {
        /**
         * 1. 4的次方一定是2的次方
         *      a. (n > 0) && ((n & (n -1))==0) 是判断数字是否是2的次方--参见231题
         * 2. 4的次方字节为1的位只有一个，在且仅在 奇数位上
         *      a. 0xaaaaaaaa的bufferString: 1010 1010 1010 1010 1010 1010 1010 1010
         *      b. (n & 0xaaaaaaaa) == 0 则说明n的位为1的位都在奇数位上
         */
        return (n >0 ) && ((n & (n -1))==0) && ((n & 0x2aaaaaaa) == 0);
    }
}
