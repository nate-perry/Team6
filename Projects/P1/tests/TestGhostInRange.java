import java.io.*;
import junit.framework.*;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(3, 4), "jim", Color.blue);
		PacMan pacman = frame.addPacMan(new Location(3, 5));
		assertTrue(pacman.is_ghost_in_range());
  }

    public void testGhostInRange2() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(4, 4), "tim", Color.blue);
		PacMan pacman = frame.addPacMan(new Location(5, 6));
		assertFalse(pacman.is_ghost_in_range());
  }
}
