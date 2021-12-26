package HackerRankChallange;
import java.util.Scanner;

public class Day3 {
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();

	        //code from here
	        if(N%2!=0){ //for odd
	            System.out.print("Weird");
	        }else{ //for even
	        if(N>=2 && N<=5){
	            System.out.print("Not Weird");
	        }
	        if(N>=6 && N<=20){
	            System.out.print("Weird");
	        }
	        if(N>20){
	            System.out.print("Not Weird");
	        }
	        }
	    }
	}

