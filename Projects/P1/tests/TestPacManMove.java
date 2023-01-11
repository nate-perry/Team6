import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
      Map myMap = new Map(5);
      Location pacLoc = new Location(2,2);
      PacMan pacman = new PacMan("pacman", pacLoc, myMap);
      assertTrue(pacman.move());
  }
}
