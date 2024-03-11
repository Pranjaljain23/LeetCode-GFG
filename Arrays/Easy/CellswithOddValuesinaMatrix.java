// 1252. Cells with Odd Values in a Matrix

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int ans = 0;

        for(int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for(int j = 0; j < n; j++) {
                arr[row][j]++;
            }
            for(int j = 0; j < m; j++) {
                arr[j][col]++;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] % 2 != 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}