class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long cs = 0l;
        long ms = Integer.MIN_VALUE;
        
        for(int i : arr) {
            cs += i;
            ms = Math.max(cs, ms);
            
            if(cs < 0) {
                cs = 0;
            }
        }
        
        return ms;
    }
}