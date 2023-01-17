import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    Map myMap = new Map(5);
    Location pacLoc = new Location(2,2);
    PacMan pacman = new PacMan("pacman", pacLoc, myMap);
    Location loc = new Location(2,3);
    assertTrue(myMap.getLoc(pacLoc).contains(Map.Type.EMPTY));
  }
}
