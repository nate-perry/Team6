import java.io.*;
import junit.framework.*;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    Map myMap = new Map(5); // create a 5x5 map

    Location pacLoc = new Location(2, 2); // Make the pacman in the middle

    Ghost ghost = new Ghost("ghost", pacLoc, myMap); // make a new pacman

    // ArrayList<Location> validLocations = pacman.get_valid_moves(); //get
    // valid_locations

    assertTrue(ghost.get_valid_moves().contains(new Location(2, 3)));

    // Add tests as code is pushed in

    // assertTrue(ghost.get_valid_moves().isEmpty());
  }
}
