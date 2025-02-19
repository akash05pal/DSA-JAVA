import java.util.Scanner;

class UserMainCode {
    public int countMaxActions(int input1, int[] input2) {
        int count = 0;
        int threeCount = 0;

        // Iterate through the array
        for (int i = 0; i < input1; i++) {
            if (input2[i] == 3) {
                threeCount++; // Increment count of 3s
            } else if (input2[i] == 4) {
                if (threeCount > 0) {
                    count++; // Increment count of valid subsequences
                    threeCount--; // Decrement count of 3s as one is used
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int[] input2 = new int[input1];

        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }

        UserMainCode obj = new UserMainCode();
        System.out.println(obj.countMaxActions(input1, input2));

        scanner.close();
    }
}