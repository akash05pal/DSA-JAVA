import java.util.*;
import java.util.Scanner;

public class oddandeven {

        static void printArray(int[] arr){
            int n= arr.length;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
        }

        static void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
        }

        static void sortoddandevens(int[] arr){
            int n=arr.length;
            int left = 0;
            int  right =n-1;
             while(left < right){
                if(arr[left]%2==1 && arr[right]%2==0){
                    swap(arr,left, right);
                    left++;
                    right--;
                }
                if(arr[left]%2==0){
                    left++;
                }
                if(arr[right]%2==1){
                    right--;
                }
             }

        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        printArray(arr);
        sortoddandevens(arr);
        System.out.println("sorted");
        printArray(arr);
    }
    
}
