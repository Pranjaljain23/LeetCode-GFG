import java.util.*;

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : a) {
            set.add(i);
        }
        
        int count = 0;
        for(int i = 0; i < m; i++) {
            if(set.contains(b[i])) {
                count++;
                set.remove(b[i]);
            }
        }
        
        return count;
        
        //correct code but didn't worked for all test cases
        // Arrays.sort(a);
        // Arrays.sort(b);
        // int i = 0, j = 0, count = 0;
        // while(i < n && j < m) {
        //     if(a[i] < b[j]) {
        //         i++;
        //     }
        //     else if(a[i] > b[j]) {
        //         j++;
        //     }
        //     else{
        //         count++;
        //         i++;
        //         j++;
        //     }
        // }
        
        // return count;
    }
};