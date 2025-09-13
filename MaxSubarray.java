import java.util.Scanner;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create MaxSubarray object and find max subarray sum
        MaxSubarray solution = new MaxSubarray();
        int result = solution.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum is: " + result);

        sc.close();
    }
}
