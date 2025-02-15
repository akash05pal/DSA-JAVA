class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Create 2D prefix sum array
        int[][] prefixSum = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                prefixSum[i][j] = matrix[i-1][j-1] + 
                                 prefixSum[i-1][j] + 
                                 prefixSum[i][j-1] - 
                                 prefixSum[i-1][j-1];
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        // Try all possible rectangles
        for(int r1 = 1; r1 <= m; r1++) {
            for(int c1 = 1; c1 <= n; c1++) {
                for(int r2 = r1; r2 <= m; r2++) {
                    for(int c2 = c1; c2 <= n; c2++) {
                        int sum = prefixSum[r2][c2] - 
                                prefixSum[r2][c1-1] - 
                                prefixSum[r1-1][c2] + 
                                prefixSum[r1-1][c1-1];
                        if(sum <= k) {
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
        }
        
        return maxSum;
    }
}
