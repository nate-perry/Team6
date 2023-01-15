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
     //We just don't want to move through other walls

     ArrayList<Location> possibleMoves = new ArrayList<Location>(); // Return object

     HashSet<Map.Type> currType = new HashSet<Map.Type>();
 
     currType = this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y + 1)); //Up one
 
     if (!(currType == null || (currType.contains(Map.Type.WALL) || currType.contains((Map.Type.GHOST))))) {
 
       possibleMoves.add(new Location(this.myLoc.x, this.myLoc.y + 1));
     } 
     
     currType = this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y - 1)); //Down one
 
     if (!(currType == null || (currType.contains(Map.Type.WALL) || currType.contains((Map.Type.GHOST))))) {
 
       possibleMoves.add(new Location(this.myLoc.x, this.myLoc.y - 1));
     } 
 
     currType = this.myMap.getLoc(new Location(this.myLoc.x + 1, this.myLoc.y)); //Right one
 
     if (!(currType == null || (currType.contains(Map.Type.WALL) || currType.contains((Map.Type.GHOST))))) {
 
       possibleMoves.add(new Location(this.myLoc.x + 1, this.myLoc.y));
     } 
 
     currType = this.myMap.getLoc(new Location(this.myLoc.x - 1, this.myLoc.y)); //Left one
 
     if (!(currType == null || (currType.contains(Map.Type.WALL) || currType.contains((Map.Type.GHOST))))) {
 
       possibleMoves.add(new Location(this.myLoc.x - 1, this.myLoc.y));
     } 
 
     return new ArrayList<Location>();
   }

  public boolean move() {
	  if(this.get_valid_moves().isEmpty()){
		  return false;
	  }else{
		  return true;
	  }
  }

  public boolean is_ghost_in_range() {
    ArrayList<Location> places = new ArrayList<Location>();
    
    places.add(new Location(this.myLoc.x + 1, this.myLoc.y + 0)); 
    places.add(new Location(this.myLoc.x - 1, this.myLoc.y - 0));

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
      return null;
    }
    return this.myMap.eatCookie(myName);
  }

}
