package HackerRankChallange;

public class Day4 {
 //Person Progrom
	    private int age;	
	  
		public void Person(int initialAge) {
	  		// Add some more code to run some checks on initialAge
	          age = initialAge < 0 ? 0 : initialAge;
		}

		public void amIOld() {
	  		// Write code determining if this person's age is old and print the correct statement:
	          String ageStatement;
	          if(age >= 18){
	              ageStatement = "You are old.";
	          }else if(age >=13 && age <18){
	              ageStatement = "You are a teenager.";
	          }else if(age > 0 && age <= 12){
	              ageStatement = "You are young.";
	          }else{
	              ageStatement = "Age is not valid, setting age to 0.\nYou are young.";
	          }
	        System.out.println(ageStatement);
		}

		public void yearPasses() {
	  		// Increment this person's age.
	          age++;
		}

}