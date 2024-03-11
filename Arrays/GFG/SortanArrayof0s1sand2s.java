class Solution
{
    public static void sort012(int arr[], int n)
    {
        /*BRUTE FORCE
            Arrays.sort(arr);
        */
        
        //OPTIMAL APPROACH
        
        //Dutch National Flag Algorithm in which we take three pointers low = 0, mid = 0, high = last index
        
        //so if arr[mid] == 0 swap with low and low++
        //if arr[mid] == 1 just mid++
        // if arr[mid] == 2 swap with high and high--
        int low = 0;
        int mid = 0;
        int high = n - 1;
        
        while(mid <= high) {
            switch(arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                
                case 1:
                    mid++;
                    break;
                    
                case 2: {
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
        }
        
    }
}