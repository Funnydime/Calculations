//Dimitri Rodriguez
//P2.1
//CS234
import java.util.Scanner;
public class Lab2_Rodriguez_Dimitri{

     public static void main(String []args){
 		Scanner in = new Scanner(System.in);
		System.out.print("What year would you like to know when was Easter Sunday?"); 
        int y = in.nextInt();
        double a = y % 19;
        double b = y / 100;
        double c = y % 100;
        double d = b / 4;
        double e = b % 4;
        double g = Math.floor((8 * b + 13) / 25);
        double h = (19 * a + b - d - g + 15) % 30;
        double j = Math.floor(c / 4);
        double k = Math.floor(c % 4);
        double m = Math.floor((a + 11 * h) / 319);
        double r = (2 * e + 2 * j - k - h + m + 32) % 7;
        double n = Math.floor((h - m + r + 90) / 25);
        double p = (h - m + r + n + 19) % 32;
        System.out.print(" a = " + a + " b = " + b + " c = " + c);
		System.out.print("\n d = " + d + " e = " + e + " g = " + g);
        System.out.print("\n h = " + h + " j = " + j + " k = " + k);
        System.out.print("\n m = " + m + " r = " + r + " n = " + n);
        System.out.print("\n p = " + p);
		System.out.print("\nAccording to my calculations " + n + "/" + p);
		System.out.print(" in " + y);
     }
}