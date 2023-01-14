import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    ArrayList<Location> places = new ArrayList<Location>();
    
    places.add(new Location(this.myLoc.x + 1, this.myLoc.y + 0)); 
    places.add(new Location(this.myLoc.x - 1, this.myLoc.y - 0));
    places.add(new Location(this.myLoc.x + 0, this.myLoc.y + 1));
    places.add(new Location(this.myLoc.x - 0, this.myLoc.y - 1));

    for (Location location:places) {
       HashSet<Map.Type> checker = myMap.getLoc(location);
       if (checker.contains(Map.Type.GHOST)) {
	return true;
       }
    }
   return false; 
  }
  public JComponent consume() {
    HashSet<Map.Type> currType = new HashSet<Map.Type>();
    currType = this.myMap.getLoc(this.myLoc);
    if (currType.contains(Map.Type.COOKIE)) {
      return this.myMap.eatCookie(myName);
    }
    return null;
  }

}