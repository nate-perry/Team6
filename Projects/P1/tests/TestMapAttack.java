import java.io.FileNotFoundException;

import junit.framework.*;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    Map myMap = new Map(5);
    Location pacLoc = new Location(2,2);
    PacMan pacman = new PacMan("pacman", pacLoc, myMap);
    //myMap.add("pacman", pacLoc, pacman, Map.Type.PACMAN);
    Location ghostLoc = new Location(2,3);
    Ghost ghost = new Ghost("ghost", ghostLoc, myMap);
    //myMap.add("ghost", ghostLoc, ghost, Map.Type.GHOST);
    assertTrue(myMap.attack("ghost"));
  }
}
