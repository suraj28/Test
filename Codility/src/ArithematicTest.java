import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArithematicTest {

	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private Arithematic arithematic;
	
	public ArithematicTest(int firstNumber, int secondNumber,
			int expectedResult, Arithematic arithematic) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
		this.arithematic = arithematic;
		//System.out.println(arithematic);
	}
	
	@Override
	public String toString() {
		return "ArithematicTest [firstNumber=" + firstNumber
				+ ", secondNumber=" + secondNumber + ", expectedResult="
				+ expectedResult + "]";
	}

	@Before
	public void initialize(){
		arithematic= new Arithematic();
	}
	
	//@Parameterized.Parameters
	@Parameters
	public static Collection<Object[]> input(){
		return Arrays.asList(new Object[][] { {1, 2, 3}, {11, 22, 33}, {10, 0, 19}, {20, 35, 55}, {100, 9, 109} });
	}
	
	@Test
	public void testArithematicTest(){
		System.out.println("Sum of numbers := "+expectedResult);
		Assert.assertEquals(expectedResult, arithematic.sum(firstNumber, secondNumber));
	}

	
}
