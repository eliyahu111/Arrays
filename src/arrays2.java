import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();


        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}