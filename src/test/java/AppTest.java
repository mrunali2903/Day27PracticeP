import jdk.incubator.vector.VectorOperators;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static junit.framework.Assert.assertTrue;



public class AppTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super();
    }

    /**
     * @return the suite of tests being tested
     */
    public static VectorOperators.Test suite()
    {
        return (VectorOperators.Test) new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
}

