package HackerRankChallange;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	public class Day8  {
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        //declare the map and initialize
	        Map<String, Integer> mMap = new HashMap<String, Integer>();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            in.nextLine();
	            mMap.put(name, phone); //putting the values and keys in the map
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            //comparing part
	            if(mMap.get(s) == null){
	                System.out.println("Not found");
	            }else{
	                System.out.println(s+ "=" + mMap.get(s));
	            }
	        }
	        in.close();
	    }
	}


