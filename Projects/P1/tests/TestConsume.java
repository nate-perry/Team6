import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
    int scale = 20;
    Map myMap = new Map(5);
    Location pacLoc = new Location(2,2);
    CookieComponent tok = new CookieComponent(2, 2, scale);
    //myMap.add("tok_x" + row + "_y" + col, loc, tok, Map.Type.COOKIE);
    PacMan pacman = new PacMan("pacman", pacLoc, myMap);
    assertEquals(pacman.consume(), tok);
  }
}
