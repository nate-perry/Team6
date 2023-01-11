import java.util.ArrayList;
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
      ArrayList<Location> possibleMoves = this.get_valid_moves();
      if(possibleMoves.isEmpty()){
	  return false;
      }else{
	  this.myLoc = possibleMoves.get(0);
	  return true;
      }
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
