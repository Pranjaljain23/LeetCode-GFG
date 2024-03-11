class Solution
{ 
    public static int findSum(int arr[],int n) 
    {
        //code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        return (min + max);
    }
}
