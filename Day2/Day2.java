package HackerRankChallange;
import java.util.Scanner;

public class Day2 {
 
//Day 2: Operators


	    // Complete the solve function below.
	    static void solve(double meal_cost, int tip_percent, int tax_percent) {
	        //solution starts from here
	        double tip = meal_cost*tip_percent/100;
	        double tax = meal_cost*tax_percent/100;
	        //calculate total
	        double total = meal_cost+tip+tax;
	        int total_cost = (int)(Math.round(total)); //type casting and rouding

	        //printing part
	        System.out.print(total_cost);
	    }

	    private static final Scanner scanner = new Scanner(System.in);
	    //input part already given
	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(meal_cost, tip_percent, tax_percent);

	        scanner.close();
	    }
	}