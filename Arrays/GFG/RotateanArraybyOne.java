class Compute {
    
    public void rotate(int arr[], int n)
    {
        // int temp = arr[n - 1];
        
        // for(int i = n - 2; i >= 0; i--) {
        //     arr[i + 1] = arr[i];
        // }
        
        // arr[0] = temp;
        
        //Two Pointer approach : Swapping numbers and only increasing i which gives resultant array which is rotated by one
        int i = 0, j = n - 1;
        
        while(i != j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
        }
    }
}