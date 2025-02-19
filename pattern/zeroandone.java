import java.util.*;
import java.util.Scanner;

public class zeroandone {

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

        static void sortzeroandones(int[] arr){
            int n=arr.length;
            
            int zeroes =0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    zeroes++;
                }
            }
            for(int i=0;i<n;i++){
                if(i<zeroes){
                    arr[i]=0;
                }
                else{
                    arr[i]=1;
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
        sortzeroandones(arr);
        System.out.println("sorteed5");
        printArray(arr);
    }
    
}
