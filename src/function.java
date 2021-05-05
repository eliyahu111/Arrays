import javax.swing.*;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
         int result =Math.round(3.9F);
        System.out.println(result);
        int e = Math.max(2,4);
        System.out.println(e);
        int r = Math.min(3,5);
        System.out.println(r);
        double a=Math.round(Math.random()*100);
        System.out.println(a);

       int u=(int)Math.round(Math.random()*10);
        System.out.println(u);
       NumberFormat currency =NumberFormat.getCurrencyInstance();
       String b= currency.format(0839.1);
       NumberFormat percent =NumberFormat.getPercentInstance();
       String c=percent.format(0.3);
       // NumberFormat currency =
        System.out.println(b+c);


    }

}
