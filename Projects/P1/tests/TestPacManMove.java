import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    Map myMap = new Map(5); //create a 5x5 map                                 

    Location ghostLoc = new Location(2,2); //Make the pacman in the middle      

    PacMan pac = new PacMan("ghost", ghostLoc, myMap); //make a new pacman                                                                 
    assertTrue(pac.move());
  }
}
