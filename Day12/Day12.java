package HackerRankChallange;

import java.security.Permission;

public class Day12 {
	class Student extends Permission {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int[] testScores;

	    /*	
	    *   Class Constructor
	    *   
	    *   @param firstName - A string denoting the Person's first name.
	    *   @param lastName - A string denoting the Person's last name.
	    *   @param id - An integer denoting the Person's ID number.
	    *   @param scores - An array of integers denoting the Person's test scores.
	    */
	    // Write your constructor here

	    /*	
	    *   Method Name: calculate
	    *   @return A character denoting the grade.
	    */
	    // Write your method here
	    Student(String firstName, String lastName, int identification, int testScores[])
	    {
	        super(firstName, lastName, identification);
	        this.testScores = testScores;
	    }
	    char calculate(){
	        char grade = 'O';
	        int sum = 0, a;
	        for(int i = 0 ; i < testScores.length; i++){
	            sum = sum+testScores[i];
	        }
	        a = sum/testScores.length;
	        if (90 <= a && a <= 100){
	            grade = 'O'; 
	        }if(80 <= a && a < 90){
	            grade = 'E';
	        }if(70 <= a && a < 80){
	            grade = 'A';
	        }if(55 <= a && a < 70){
	            grade = 'P';
	        }if(40 <= a && a < 55){
	            grade = 'D';
	        }if(a<40){
	            grade = 'T';
	        }
	        return grade;
	    }
		@Override
		public boolean implies(Permission permission) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public String getActions() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
