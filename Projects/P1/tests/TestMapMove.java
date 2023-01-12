import java.io.*;

import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    Map myMap = new Map(5); //create a 5x5 map

    Location pacLoc = new Location(2,2); //Make the pacman in the middle

    Location ghostLoc = new Location(4, 4);

    //ArrayList<Location> validLocations = pacman.get_valid_moves(); //get valid_locations

    //assertTrue(pacman.get_valid_moves().contains(new Location(2, 3)));

    //assertTrue(pacman.get_valid_moves().isEmpty());

    assertTrue(myMap.move("pacman", pacLoc, Map.Type.PACMAN));

    assertTrue(myMap.move("pacman", ghostLoc, Map.Type.GHOST));
  }
}
