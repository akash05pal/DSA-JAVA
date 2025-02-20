import java.util.Scanner;

public class removeduplicate {
    static int  removeduplicateinArray(int[] arr,int n){
        int res=1;
        for(int i =1; i< n; i++){
            if(arr[i]!= arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
    }
        return res;
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int newSize = removeduplicateinArray(arr, n);

        // Print the modified array
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();

    }
}
