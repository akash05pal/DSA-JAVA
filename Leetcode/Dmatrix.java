package Leetcode;

import java.util.Scanner;

public class DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read dimensions and target sum
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        // Create and read the 2D array
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Count subarrays with sum k
        int count = 0;
        for(int i = 0; i < n; i++) {
            int[] sum = new int[m];
            for(int j = i; j < n; j++) {
                for(int col = 0; col < m; col++) {
                    sum[col] += arr[j][col];
                }
                count += findSubarraysWithSum(sum, k);
            }
        }
        
        System.out.println(count);
        sc.close();
    }
    
    private static int findSubarraysWithSum(int[] arr, int k) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
}
