import java.io.*;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
     Map myMap = new Map(5);
     
    Location pacLoc = new Location(2,2);

    Ghost ghost = new Ghost("ghost", pacLoc, myMap);

    assertTrue(ghost.move());
  }
    
}
