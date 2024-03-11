import java.util.HashSet;

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //BETTER APPORACH
        // int[] prefix = new int[n];
        // prefix[0] = arr[0]; 
        
        // for(int i = 1; i < n; i++) {
        //     prefix[i] = prefix[i - 1] + arr[i];
        // }
        
        
        // for(int start = 0; start < n; start++) {
        //     for(int end = start; end < n; end++) {
        //         int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        //         if(sum == 0) {
        //             return true;
        //         }
        //     }
        // }
        
        // return false;
        
        //OPTIMAL APPROACH
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            if(sum == 0 || arr[i] == 0) {
                return true;
            }
            
            if(!set.contains(sum)) {
                set.add(sum);
            }
            else {
                return true;
            }
        }
        
        return false;
    }
}