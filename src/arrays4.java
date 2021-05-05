import java.util.Arrays;
import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arrays = new int[a];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = in.nextInt();

            int minIndex = arrays3.findMin(arrays, i);

        }
        System.out.println(findMin(arrays));
    }

    public static int findMin(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {

            if (arrays [i] < i) {

                return i;
            }
        }

        int minIndex = arrays3.findMin(arrays, 0);
        return 0;

    }
}

