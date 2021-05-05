import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class arrays5 {
    public static void main(String[] args) {
        byte age = 3;
        Date age1 = new Date();


        Point two = new Point(2, 4);
        System.out.println(two);
        String message ="  Hello World   " ;
        System.out.println(message);
        System.out.println(message.endsWith("world"));

        System.out.println(message.indexOf("e"));

        System.out.println(message.replace("e","*"));

        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println("\"Mosh\"");
        System.out.println("\\Mosh\\");
        System.out.println("I am \n think this is a \n");
        System.out.println("I am \t think this is a ");

        int [] number ={1,2,3,4,5};
        System.out.println(Arrays.toString(number));
        int [][] num ={{2,3,5},{3,5,43,45}};
        System.out.println(Arrays.deepToString(num));
        int [][][]a=new int[2][2][2];
        System.out.println(Arrays.deepToString(a));
       
    }
}