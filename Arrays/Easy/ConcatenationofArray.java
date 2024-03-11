// 1929. Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];

        for(int i = 0; i < nums.length; i++){
            arr[i] = arr[i + n] = nums[i];
        }

        return arr;
    }
}