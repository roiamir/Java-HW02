package relayware.java.training.java_HW02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsInteger {

    Pattern intPattern = null;
    

    public IsInteger() {
    	intPattern = Pattern.compile("-?[0-9]+");
    	
    	
    }

	public boolean check(String s)
	{
		if (s == null){
			return false;
		}
			
		Matcher matcher = intPattern.matcher(s);
		return matcher.matches();

	}
}
