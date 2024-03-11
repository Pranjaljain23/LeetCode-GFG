class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long pref = 1;
        long suff = 1;
        long result = Long.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(pref == 0) pref = 1;
            if(suff == 0) suff = 1;
            
            pref *= arr[i];
            suff *= arr[n - i - 1];
            
            result = Math.max(result, Math.max(pref, suff));
        }
        
        return result;
    }
}