//package NEW;
import java.util.Scanner;
import java.util.*;

public class largestelement {

    static int largestelement(int arr[] , int n){
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");5
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
            System.out.println(largestelement(arr,n));
    }
    
}
