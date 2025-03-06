class Solution {
    public int[] findKLargestElements(int[] arr, int k) {
        // Sort array in descending order
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Store first k elements in result array
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {9, 7, 2, -1, 0, 8};
        int k = 3;
        
        Solution solution = new Solution();
        int[] result = solution.findKLargestElements(arr, k);
        
               for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
