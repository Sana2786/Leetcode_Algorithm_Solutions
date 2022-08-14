#Runtime: 9 ms, faster than 25.21% of Java online submissions for Squares of a Sorted Array.
  class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sor = new int [nums.length];
        for(int i = 0; i <nums.length;i++){
            sor[i]=nums[i]*nums[i];
        }
        Arrays.sort(sor);
        return sor;
    }
}
