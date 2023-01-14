import java.util.ArrayList;
import java.util.HashSet;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {

    //We just don't want to move through other walls

    ArrayList<Location> possibleMoves = new ArrayList<Location>(); // Return object

    HashSet<Map.Type> currType = new HashSet<Map.Type>();

    currType = this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y + 1)); //Up one

    if (!(currType == null || (currType.contains(Map.Type.WALL)))) {

      possibleMoves.add(new Location(this.myLoc.x, this.myLoc.y + 1));
    } 
    
    currType = this.myMap.getLoc(new Location(this.myLoc.x, this.myLoc.y - 1)); //Down one

    if (!(currType == null || (currType.contains(Map.Type.WALL)))) {

      possibleMoves.add(new Location(this.myLoc.x, this.myLoc.y - 1));
    } 

    currType = this.myMap.getLoc(new Location(this.myLoc.x + 1, this.myLoc.y)); //Right one

    if (!(currType == null || (currType.contains(Map.Type.WALL)))) {

      possibleMoves.add(new Location(this.myLoc.x + 1, this.myLoc.y));
    } 

    currType = this.myMap.getLoc(new Location(this.myLoc.x - 1, this.myLoc.y)); //Left one

    if (!(currType == null || (currType.contains(Map.Type.WALL)))) {

      possibleMoves.add(new Location(this.myLoc.x - 1, this.myLoc.y));
    } 

    return possibleMoves;
  }

  public boolean move() {
     ArrayList<Location> possibleMoves = this.get_valid_moves();
      if(possibleMoves.isEmpty()){
	  return false;
      }else{
	  this.myLoc = possibleMoves.get(0);
	  return true;
      }
  }

  public boolean is_pacman_in_range() {
    ArrayList<Location> places = new ArrayList<Location>();

    places.add(new Location(this.myLoc.x + 1, this.myLoc.y + 0)); 
    places.add(new Location(this.myLoc.x - 1, this.myLoc.y - 0));
    places.add(new Location(this.myLoc.x + 0, this.myLoc.y + 1));
    places.add(new Location(this.myLoc.x - 0, this.myLoc.y - 1));

    for (Location location:places) {
       HashSet<Map.Type> checker = myMap.getLoc(location);
       if (checker.contains(Map.Type.PACMAN)) {
	return true;
       }
    }
   return false; 
  }

  public boolean attack() {
    if (is_pacman_in_range()) {
      return this.myMap.attack(this.myName);
    }
    return false;
  }
}
