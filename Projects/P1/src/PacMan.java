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
    //We are in a pacman object, return an array list of locations
    //Use the map to determine where we can go and where we can't
    //Location has a public x and a public y
    //Current location = this.myLoc.x and this.myLoc.y (x & y)
    //Map has walls that we can use, and we don't want to move if it is
    //a wall or a ghost

    ArrayList<Location> possibleMoves = new ArrayList<Location>(); // Return object

    HashSet<Map.Type> currType = new HashSet<Map.Type>();

    currType = this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y + 1)); //Up one

    if (!(currType == null || (currType.contains(Map.Type.WALL) ||
    currType.contains(Map.Type.GHOST)))) {

      possibleMoves.add(new Location(this.myLoc.x, this.myLoc.y + 1));
    } 
    
    currType = this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y - 1)); //Down one

    if (!(currType == null || (currType.contains(Map.Type.WALL) ||
    currType.contains(Map.Type.GHOST)))) {

      possibleMoves.add(new Location(this.myLoc.x, this.myLoc.y - 1));
    } 

    currType = this.myMap.getLoc(new Location(this.myLoc.x + 1, this.myLoc.y)); //Right one

    if (!(currType == null || (currType.contains(Map.Type.WALL) ||
    currType.contains(Map.Type.GHOST)))) {

      possibleMoves.add(new Location(this.myLoc.x + 1, this.myLoc.y));
    } 

    currType = this.myMap.getLoc(new Location(this.myLoc.x - 1, this.myLoc.y)); //Left one

    if (!(currType == null || (currType.contains(Map.Type.WALL) ||
    currType.contains(Map.Type.GHOST)))) {

      possibleMoves.add(new Location(this.myLoc.x - 1, this.myLoc.y));
    } 

    return possibleMoves;

  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
