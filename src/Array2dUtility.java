
public class Array2dUtility {
    // Declare all methods as static.

    // 1. print
    public static void print(int[][] nums){
        for (int[] num : nums) {
            for (int i : num) {
                System.out.println(i);
            }
        }
    }
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    // 2. sum
    public static int sum(int[][] nums){
        int sum = 0;
        for (int[] num: nums){
            for (int i : num){
                sum+=i;
            }
        }
        return sum;
    }
    // Implement a method called sum that returns the sum of a 2D array of integers

    // 3. average
    public static double average(int[][] nums){
        int sum = sum(nums);
        return (double) sum /(nums.length * nums.length);
    }
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    // 4. minimum
    public static int minimum(int[][] nums){
        int min = nums[0][0];
        for (int[] num : nums){
            for (int i : num){
                if (i < min){
                    min = i;
                }
            }
        }
        return min;
    }
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    // 5. maximum
    public static int maximum(int[][] nums){
        int max = nums[0][0];
        for (int[] num : nums){
            for (int i : num){
                if (i > max){
                    max = i;
                }
            }
        }
        return max;
    }
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (nums[i][j]%2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] nums){
        int count = 0;
        for (int[] num : nums){
            for (int i : num){
                if (i%2 == 0) count++;
            }
        }
        return count;
    }

    // 8. allPositive
    public static boolean allPositive(int[][] nums){
        for (int[] num : nums){
            for (int i : num){
                if (i < 0) return false;
            }
        }
        return true;
    }
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    // 9. rowSums
    public static int[] rowSums(int[][] nums){
        int[] sums = new int[nums.length];
        int i = 0;
        for (int[] num : nums){
            int sum = 0;
            for (int h : num){
                sum+=h;
            }
            sums[i] = sum;
            i++;
        }
        return sums;
    }
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    // 10. colSums
    public static int[] colSums(int[][] nums){
        int[] sums = new int[nums[0].length];
        for (int i = 0; i < nums[0].length; i++){
            int sum = 0;
            for (int[] row : nums){
                sum+=row[i];
            }
            sums[i] = sum;
        }
        return sums;
    }
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

}
