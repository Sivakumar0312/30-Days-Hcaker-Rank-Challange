package HackerRankChallange;

import java.util.Scanner;

public class Day6  {

    public static void main(String[] args) {
        try (/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        //taking the input
		Scanner sc = new Scanner(System.in)) {
			int T= sc.nextInt();
			String s;
			for(int i =0;i<T;i++){
			    s=sc.next();
			     
			    for(int j =0;j<s.length();j++){
			        if(j%2==0){
			            System.out.print(s.charAt(j));
			        }
			    }
			    System.out.print(" ");
			    for(int j =0;j<s.length();j++){
			        if(j%2==1){
			            System.out.print(s.charAt(j));
			        }
			    }
			    System.out.println();
			}
		}
    }
}
