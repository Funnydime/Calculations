//Dimitri Rodriguez
//P2.13
//CS234
import java.util.Scanner;
public class Lab213_Rodriguez_Dimitri{

     public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("Select a Frequency");
		double f = in.nextDouble();
		System.out.print(f + " Hz" + "Has been selected");
		System.out.println("\nSelect a Cmin");
		double cmin = in.nextDouble();
		System.out.print(cmin + " pF " + "Has been selected");
		System.out.println("\nSelect a Cmax");
		double cmax = in.nextDouble();
		System.out.print(cmax + " pF " + "Has been selected");
		
		double C = Math.sqrt(cmin*cmax);
		double fmin = 1/(4*(Math.pow(Math.PI,2))*(Math.pow(f, 2)*cmin));
		double fmax = 1/(4*(Math.pow(Math.PI,2))*(Math.pow(f, 2)*cmax));
		double L = 1/(4*(Math.pow(Math.PI,2))*(Math.pow(f, 2)*C));
		System.out.println("\nThe frequencies range is " + fmin + "F - " + fmax + "F");
     }
}