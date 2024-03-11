import java.util.*;

class Solution {
    static ArrayList<Integer> factorial(int n){
        //Declare an ArrayList
        ArrayList <Integer> list = new ArrayList<>();
        
        int size = 0, c = 0;
        
        //Adding 1 at 0th index
        list.add(0, 1);
        
        // update size
        size = 1;
        
        // Declare a variable to traverse from 2 to n
        int val = 2;
        while(val <= n) {
            // Traverse arraylist from right to left
            for(int i = size - 1; i >= 0; i--) {
                // update value in arraylist
                int temp = list.get(i) * val + c;
                // add last digit to index and add remaining to carry
                list.set(i, temp%10);
                //update carry
                c = temp/10;
            }
            
            // insert carry digit by digit to the beginning of the arraylist
            while(c != 0) {
                list.add(0, c%10);
                c = c/10;
                size++;
            }
            val++;
        }
        
        return list;
    }
}