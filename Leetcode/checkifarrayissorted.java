import java.util.Scanner;

public class checkifarrayissorted {

    static boolean checkifarrayissorted(int[] arr){
        int n = arr.length;    
        int i=0;
            int j=n-1;
            
            while(i<j){
                if(arr[i]<arr[j]){
                    return true;
                }
                else {
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean result = checkifarrayissorted(arr);
        System.out.println(result);


    }
    
}
