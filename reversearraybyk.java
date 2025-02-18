import java.util.Scanner;

public class reversearraybyk {
    

    static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int[] ans = new int[n];
        int j=0;
        //2nd half arry storing
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];

        }
            // first half array storing
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;

    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter k");
        int k = sc.nextInt();
        printArray(arr);
        int[] ans = rotate(arr,k);

       printArray(ans);
        
    }
}
