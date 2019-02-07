package cmput402.tdd;

import java.util.HashMap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import cmput402.tdd.service.Search;
import org.mockito.Mock;
import cmput402.tdd.Utility;
/**
 * Unit test for simple App.
 */
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
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void testCountAverageScore(){
        Utility util = new Utility();
        Search mockSearch = mock(Search.class);
        HashMap<String, ArrayList<Integer>> fakeMap = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> messi = new ArrayList<Integer>();
        messi.add(100);
        messi.add(100);

        ArrayList<Integer> ronaldo = new ArrayList<Integer>();
        ronaldo.add(80);
        ronaldo.add(150);

        ArrayList<Integer> neymar = new ArrayList<Integer>();
        neymar.add(50);
        neymar.add(80);
        
        fakeMap.put("messi", messi);
        fakeMap.put("ronaldo", ronaldo);
        fakeMap.put("neymar", neymar);

        when(mockSearch.returnAll()).thenReturn(fakeMap);
        HashMap<String, Float> results = util.countAverageScore(mockSearch);

        System.out.println(results.get("ronaldo"));

        assert(2==results.get("messi"));
        assert((float)1.875==results.get("ronaldo"));
        assert(1.6==results.get("neymar"));
    }
}
