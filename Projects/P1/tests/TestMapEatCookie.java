import java.io.*;

import javax.swing.JComponent;

import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
		Map map = frame.getMap();
		frame.addPacMan(new Location(3,3));
		String namecoo = "tok_x" + 1 + "_y" + 1;
		JComponent eatCookies = map.eatCookie(namecoo);

	    
		assertTrue(eatCookies != null); 

		assertFalse(map.getLoc(new Location(3,3)).contains(Map.Type.COOKIE));
  }
}
