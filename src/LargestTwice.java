import java.util.Scanner;

public class LargestTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int largestIndex = 0;
        int largestValue = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > largestValue) {
                largestValue = nums[i];
                largestIndex = i;
            }
        }

        boolean isAtLeastTwice = true;
        for (int i = 0; i < n; i++) {
            if (i != largestIndex && largestValue < 2 * nums[i]) {
                isAtLeastTwice = false;
                break;
            }
        }

        if (isAtLeastTwice) {
            System.out.println(largestIndex);
        } else {
            System.out.println(-1);
        }
    }
}
