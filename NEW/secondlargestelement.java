//package NEW;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;


public class secondlargestelement {
    static int getlargest(int[] arr){
        int largest =0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    static int secondlargestelement(int[] arr){
        int largest = getlargest(arr);
        int res=-1;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=largest){
                if(res==-1 ){
                    res = i;
                }
                else if (arr[i]>arr[res]){
                    res = i;
                }
            }
            
        }
        return res;
    }
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int max = secondlargestelement(arr);
     System.out.println(max);
     sc.close();
    
    }
    
}
