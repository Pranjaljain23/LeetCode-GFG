import java.util.*;

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   int longest = 0;
	   
	   HashSet <Integer> set = new HashSet<>();
	   
	   for(int i = 0; i < N; i++) {
	       set.add(arr[i]);
	   }
	   
	   
	   for(int iterator : set) {
	       int count = 0;
	       
	       if(!set.contains(iterator - 1)) {
	           count = 1;
	           int x = iterator;
	           while(set.contains(x + 1)) {
	               count++;
	               x++;
	           }
	           longest = Math.max(count, longest);
	       }
	   }
	   return longest;
	}
}