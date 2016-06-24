package relayware.java.training.java_HW02;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class IsIntegerTest {

	IsInteger checker = new IsInteger();
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { "1", true }, 
                 { "0123456789", true },
                 { "00011122236565465465", true },
                 { "-1", true },
                 { " 1", false},
                 { "1 ", false},
                 { "5t", false },
                 { "t65", false },
                 { "456 345", false },
                 { "21312-", false },
                 { "", false },
                 {null, false}
           });
    }

    @Parameter // first data value (0) is default
    public String fInput;

    @Parameter(value = 1)
    public boolean fExpected;


    
    
    @Test
    public void test() {
    	
        assertEquals(fExpected, checker.check(fInput));
    }
	


}
