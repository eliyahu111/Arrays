import java.util.Scanner;

public class arrays3 {


    public static boolean checkVal(int[] nums, int val, int index) {
        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] == val)
                return true;
        }
        return false;
    }

    public static void printDif(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!checkVal(nums, nums[i], i)) {
                System.out.println(nums[i]);
                break;
            }
        }
    }

    //finds the minimum value in a sub array
    public static int findMin(int[] nums, int from) {
        int index = from;
        for (int i = from + 1; i < nums.length; i++) {
            if (nums[i] < nums[index])
                index = i;
        }
        return index;
    }

    //swaps two values of the array by given indexes
    public static void swap(int[] nums, int index, int from) {
        int temp = nums[index];
        nums[index] = nums[from];
        nums[from] = temp;
    }

    //sorts the array
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = findMin(nums, i);
            swap(nums, minIndex, i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        printDif(nums);
    }
}


