import java.awt.Color;
import java.io.*;
import junit.framework.*;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(5, 4), "tom", Color.RED);
		PacMan pacman = frame.addPacMan(new Location(5, 3));
		assertTrue(pacman.is_ghost_in_range());
  }

    public void testPacManInRange2() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(2, 2), "larry", Color.RED);
		PacMan pacman = frame.addPacMan(new Location(5, 6));
		assertFalse(pacman.is_ghost_in_range());
  }
}
