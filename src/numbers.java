import java.util.Arrays;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[5];
        //int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();

            //   b[a.length - i - 1] = a[i];

        }
        System.out.println(Arrays.toString(a));
        //  System.out.println(Arrays.toString(b));
        //  for (int i = c.length - 1; i >= 0; i--) {

    }

}



