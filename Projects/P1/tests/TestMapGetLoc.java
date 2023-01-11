import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
      Map myMap = new Map(5);

      assertTrue(myMap.getLoc(new Location(2,2)) == Map.Type.EMPTY);
  }
}
