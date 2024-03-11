import java.util.*;

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        //TLE FOR LARGE SOLUTIONS
        // int count = 0;
        // for(int i = 0; i < n - 1; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         if(arr[i] + arr[j] == k) {
        //             count++;
        //         }
        //     }
        // }
        
        // return count;
        
        //Using Hashmap for O(1) operations so we can do the problem in O(n) time
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            if(map.containsKey(k - arr[i])) {
                count += map.get(k - arr[i]); //adding the frequency of the element
            }
            map.put(arr[i] , map.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }
}