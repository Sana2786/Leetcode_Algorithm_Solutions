#Runtime: 1 ms, faster than 100.00% of Java online submissions for Single Number.
class Solution {
    public int singleNumber(int[] nums) {
             int ans = 0;

    for (final int num : nums)
      ans ^= num;

    return ans;    

    }
}
