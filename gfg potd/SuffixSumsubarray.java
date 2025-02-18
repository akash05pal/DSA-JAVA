import java.util.Scanner;

public class SuffixSumsubarray {
    static int findArraySum(int[] arr){
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
            totalsum += arr[i];
        }
        return totalsum;
    }

    static boolean EqualSumPartition(int[] arr){
        int totalsum = findArraySum(arr);
        int prefixsum = 0;
        for(int i=0;i<arr.length;i++){
            prefixsum += arr[i];
            int suffixsum = totalsum - prefixsum;
            if(suffixsum == prefixsum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(EqualSumPartition(arr));

    }
}
