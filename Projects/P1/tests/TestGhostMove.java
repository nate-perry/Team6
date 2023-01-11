import java.io.*;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
      Map myMap = new Map(5);
      Location ghostLoc = new Location(2,2);
      Ghost ghost = new Ghost("ghost", ghostLoc, myMap);
      assertTrue(ghost.move());
  }
}
