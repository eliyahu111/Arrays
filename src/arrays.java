import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static String[] s(int [] nums) {
        String [] strings = new String[nums.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = nums[i] + "";
        }
        return strings;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        String[] strings = s(nums);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(s(nums)));
    }
}

