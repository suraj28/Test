import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {				
    @Rule		
    public ErrorCollector collector = new ErrorCollector();							

    JUnitMessage jm= new JUnitMessage("here is an error");
    
    @Test		
    public void example() {					
    collector.addError(new Throwable("There is an error in first line"));							
    collector.addError(new Throwable("There is an error in second line"));							
    //collector.checkThat(jm.getResults(), not(containsString("here is an error")));			
    // all lines of code will execute and at the end a combined failure will be logged in.		
    }	
    
    @Test		
    public void example1() {					
    collector.addError(new Throwable("There is an error in first line"));							
    collector.addError(new Throwable("There is an error in second line"));							

        System.out.println("Hello");					
        try {			
            Assert.assertTrue("A " == "B");					
        } catch (Throwable t) {					
            collector.addError(t);					
        }		
        System.out.println("World!!!!");					
    }
}	