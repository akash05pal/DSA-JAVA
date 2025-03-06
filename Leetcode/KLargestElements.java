// class Solution {
//     public int[] findKLargestElements(int[] arr, int k) {
//         // Sort array in descending order
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = i + 1; j < arr.length; j++) {
//                 if(arr[i] < arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     int[] result = new int[k];
    //     for(int i = 0; i < k; i++) {
    //         result[i] = arr[i];
    //     }
    //     return result;
    // }


    
   
    public class KLargestElements {
        public static void storeKLargest(int[] arr1, int k) {
            int[] arr2 = new int[k];
            
            for(int i = 0; i < k; i++) {
                arr2[i] = arr1[i];
            }
            
            for(int i = k; i < arr1.length; i++) {
                int smallestIndex = findSmallestIndex(arr2);
                if(arr1[i] > arr2[smallestIndex]) {
                    arr2[smallestIndex] = arr1[i];
                }
            }
            
            
            for(int num : arr2) {
                System.out.print(num + " ");
            }
        }
        
        private static int findSmallestIndex(int[] arr) {
            int smallestIndex = 0;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            return smallestIndex;
        }
        
        public static void main(String[] args) {
            int[] arr1 = {9, 7, 2, -1, 0, 8};
            int k = 3;
            storeKLargest(arr1, k);
        }
    }
    