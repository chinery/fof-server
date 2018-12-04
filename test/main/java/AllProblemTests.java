import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IsEvenTest.class, ReverseStringTest.class })
public class AllProblemTests {

	static final String[] BAD_INPUT_DATA = {"T", "TRUEE", "", "System.exit(0)", "%$';//\"\\£"}; 
	
}
