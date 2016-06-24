package relayware.java.training.java_HW02;


import java.util.*;

public class HW02 {
	

	// Task 01
	public static int getSumOfNumbers(String s) {
        /*
        Please implement this method to
        return the sum of all integers found in the parameter String. You can assume that
        integers are separated from other parts with one or more spaces (' ' symbol).
        For example, s="12 some text 3  7", result: 22 (12+3+7=22)
       */
		if (s == null) {
			return 0;
		}

		StringTokenizer st = new StringTokenizer(s);
		IsInteger isInteger = new IsInteger();
		
		int sum = 0;
	
	    while (st.hasMoreTokens()) {
	         String token = st.nextToken();
         
	         if (isInteger.check(token)){
	        	 sum += Integer.parseInt(token);
	         }
	     } 
		return sum;
    }
	
	
	
	// Task 02
	public static void sortIgnoringSpaces(String[] a) {
		/*
        Please implement this method to
        sort a given array of Strngs in alphabetical order
        ignoring spaces (' ' symbols) within the strings.
       */
		if (a==null) {
			return;
		}
		Arrays.sort(a, new Comparator<String>(){
        		public int compare (String o1, String o2){
        			String noSpace1 = o1.trim();
        			String noSpace2 = o2.trim();
        			return noSpace1.compareTo(noSpace2);
        		}
        	}
        );
    }
	
	

}