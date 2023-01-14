import java.io.*;
import junit.framework.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    Map myMap = new Map(5); //create a 5x5 map

    Location ghostLoc = new Location(2,2); //Make the pacman in the middle

    PacMan pac = new PacMan("ghost", ghostLoc, myMap); //make a new pacman

    //ArrayList<Location> validLocations = pacman.get_valid_moves(); //get valid_locations

    assertTrue(pac.get_valid_moves().contains(new Location(2, 3)));

    //Add tests as code is pushed in

    //assertTrue(pac.get_valid_moves().isEmpty());
  }
}
