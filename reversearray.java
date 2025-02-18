 class reversearray {
    // Method to swap elements in array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to reverse array
    static void reversearray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    // Method to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reversearray(arr);
        printArray(arr);
    }
}
