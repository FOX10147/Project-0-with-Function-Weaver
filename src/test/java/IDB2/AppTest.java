package IDB2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import IDB2.FunctionWeaver.Calculators.*;

/** Used to test basic calculator calculation methods for
 * accuracy in method invocations.
 */
public class AppTest 
{
    @Test 
    public void addTest()
    {   ASCalculator addingTester = new ASCalculator();
        StringBuilder actual = new StringBuilder();
        actual.setLength(6);
        actual.append("3+4");
        String expected = "7.0";
        addingTester.add(actual);
        assertEquals(expected, actual.toString());
        actual = addingTester.add(new StringBuilder("-3+4"));
        expected = "+1.0";
        assertEquals(expected, actual.toString());
        actual = addingTester.add(new StringBuilder("-3+1"));
        expected = "-2.0";
        assertEquals(expected, actual.toString());
    }

    @Test
    public void substractTest()
    {   ASCalculator subtractingTester = new ASCalculator();
        StringBuilder actual = new StringBuilder();
        actual.setLength(6);
        actual.append("5-4");
        String expected = "1.0";
        subtractingTester.subtract(actual);
        assertEquals(expected, actual.toString());
        actual = subtractingTester.subtract(new StringBuilder("4-5"));
        expected = "-1.0";
        assertEquals(expected, actual.toString());
        actual = subtractingTester.subtract(new StringBuilder("-1-2"));
        expected = "-3.0";
        assertEquals(expected, actual.toString());
        actual = subtractingTester.subtract(new StringBuilder("-1--2"));
        expected = "1.0";
        assertEquals(expected, actual.toString());
    }

    @Test
    public void multiplyTest()
    {   MDCalculator multiplyTester = new MDCalculator();
        StringBuilder actual = new StringBuilder();
        actual.setLength(6);
        actual.append("3*4");
        String expected = "12.0";
        multiplyTester.multiply(actual);
        assertEquals(expected, actual.toString());
        actual = multiplyTester.multiply(new StringBuilder("-3*-4"));
        assertEquals(expected, actual.toString());
        actual = multiplyTester.multiply(new StringBuilder("-3*4"));
        expected = "-12.0";
        assertEquals(expected, actual.toString());
        actual = multiplyTester.multiply(new StringBuilder("3*-4"));
        assertEquals(expected, actual.toString());
    }   

    @Test
    public void divideTest()
    {   MDCalculator divideTester = new MDCalculator();
        StringBuilder actual = new StringBuilder();
        actual.setLength(6);
        actual.append("6/2");
        String expected = "3.0";
        divideTester.divide(actual);
        assertEquals(expected, actual.toString());
        actual = divideTester.divide(new StringBuilder("-6/-2"));
        assertEquals(expected, actual.toString());
        actual = divideTester.divide(new StringBuilder("-6/2"));
        expected = "-3.0";
        assertEquals(expected, actual.toString());
        actual = divideTester.divide(new StringBuilder("6/-2"));
        assertEquals(expected, actual.toString());
    }

    @Test
    public void powersTest()
    {   Powers powerTester = new Powers();
        StringBuilder actual = new StringBuilder();
        actual.setLength(6);
        actual.append("2^(3)");
        String expected = "8.0";
        powerTester.powerTest(actual);
        assertEquals(expected, actual.toString());
        actual = powerTester.powerTest(new StringBuilder("2^(-3)"));
        expected = "0.125";
        assertEquals(expected, actual.toString());
        actual = powerTester.exponentTest(new StringBuilder("e^(2)"));
        actual.setLength(6);
        expected = "7.3890";
        assertEquals(expected, actual.toString());
    }

    @Test
    public void logarithmTest()
    {   Logarithm logTester = new Logarithm();
        StringBuilder actual = new StringBuilder();
        actual.append("log(8)");
        String expected = "2.0794";
        logTester.LogTest(actual);
        actual.setLength(6);
        assertEquals(expected, actual.toString());
    }

    @Test
    public void rootTest()
    {   Roots rootTest = new Roots();
        StringBuilder actual = new StringBuilder();
        actual.append("sqrt(4)");
        String expected = "2.0";
        rootTest.SquareRootTest(actual);
        assertEquals(expected, actual.toString());
    }

    @Test
    public void trigTest()
    {   Trigonometry trigTester = new Trigonometry();
        StringBuilder actual = new StringBuilder();
        actual.append("sin(1)");
        String expected = "0.8414";
        trigTester.sinTest(actual);
        actual.setLength(6);
        assertEquals(expected, actual.toString());
        actual = trigTester.cosTest(new StringBuilder("cos(1)"));
        actual.setLength(6);
        expected = "0.5403";
        assertEquals(expected, actual.toString());
        actual = trigTester.tanTest(new StringBuilder("tan(1)"));
        actual.setLength(6);
        expected = "1.5574";
        assertEquals(expected, actual.toString());
        actual = trigTester.cscTest(new StringBuilder("csc(1)"));
        actual.setLength(6);
        expected = "1.1883";
        assertEquals(expected, actual.toString());
        actual = trigTester.secTest(new StringBuilder("sec(1)"));
        actual.setLength(6);
        expected = "0.5403";
        assertEquals(expected, actual.toString());
        actual = trigTester.cotTest(new StringBuilder("cot(1)"));
        actual.setLength(6);
        expected = "0.6420";
        assertEquals(expected, actual.toString());
    }
}
