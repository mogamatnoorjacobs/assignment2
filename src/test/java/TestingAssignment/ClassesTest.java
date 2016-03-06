package TestingAssignment;

import org.testng.annotations.Test;
//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.testng.Assert.*;

/**
 * Unit test for simple Classes.
 */
public class ClassesTest
{
    @Test
  public void floatingPass()
{
    Classes c = new Classes();
    double result = c.add(2.00, 3.00);
    double expected = 5.00;

    assertEquals(expected, result, 0.01); //7.00 for the failing test and 5.00 to pass
}

    public void floatingFail()
    {
        Classes c = new Classes();
        double result = c.add(2.00, 3.00);
        double expected = 7.00;

        assertEquals(expected, result, 0.01); //7.00 for the failing test and 5.00 to pass
    }

   public void integerPass()
    {
        Classes c = new Classes();
        int result = c.minus(3,2);
        int expected = 1;

        assertEquals(expected, result); //2 for the failing test and 1 to pass
    }

   public void integerFail()
    {
        Classes c = new Classes();
        int result = c.minus(3,2);
        int expected = 3;

        assertEquals(expected, result); //2 for the failing test and 1 to pass
    }

    public void objectEquality()
    {
        Classes c = new Classes();
        int result = c.minus(3,2);
        int expected = 1;

        assertSame(expected, result); //Objects has the same type.To fail change expected to double
    }

    public void objectNotEquality()
    {
        Classes c = new Classes();
        int result = c.minus(3,2);
        int expected = 1;

        assertNotSame(expected, result); //Objects has the same type.To fail change expected to double
    }

    public void nullness()
    {
        Classes c = new Classes();
        String result = c.testString("test");

        assertNull(result); //to pass null test result should be null
    }

    public void notNullness()
    {
        Classes c = new Classes();
        String result = c.testString("test");

        assertNotNull(result); // to fail test result value should be null
    }



}
