import java.util.Arrays;
import java.util.Scanner;

public class nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        //  It is an array that contains several numbers and sorts them
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}


