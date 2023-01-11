import java.io.*;
import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    
    Map myMap = new Map(5); //create a 5x5 map

    Location pacLoc = new Location(2,2); //Make the pacman in the middle

    PacMan pacman = new PacMan("pacman", pacLoc, myMap); //make a new pacman

    //ArrayList<Location> validLocations = pacman.get_valid_moves(); //get valid_locations

    //assertTrue(pacman.get_valid_moves().contains(new Location(2, 3)));

    assertTrue(pacman.get_valid_moves().isEmpty());

  }
}
