import java.util.*;

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) {
        //Optimized Approach
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for(int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        return set.size();
        
        //Brute force
        // int[] c = new int[n + m];
        // for(int i = 0; i < n; i++) {
        //     c[i] = a[i];
        // }
        
        // for(int i = n; i < m + n; i++) {
        //     c[i] = b[i - n];
        // }
        // int count = 1;
        // Arrays.sort(c);
        // for(int i = 0; i < n + m - 1; i++) {
        //     if(c[i] != c[i + 1]) {
        //         count++;
        //     }
        // }
        
        // return count;
    }
}