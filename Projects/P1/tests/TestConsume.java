import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
    int scale = 20;
    Map myMap = new Map(5);
    Location pacLoc = new Location(2,2);
    CookieComponent tok = new CookieComponent(2, 2, scale);
    myMap.add("tok_x" + pacLoc.x + "_y" + pacLoc.y, pacLoc, tok, Map.Type.COOKIE);
    PacMan pacman = new PacMan("pacman", pacLoc, myMap);
    myMap.add(pacman.myName,pacLoc, new PacManComponent(pacLoc.x,pacLoc.y, 5) ,Map.Type.PACMAN );
    assertEquals(pacman.consume(), tok);
  }
}
