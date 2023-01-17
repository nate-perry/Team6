import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;
import java.util.ArrayList;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;
  private HashMap<String, PacMan> pacmans;
  private HashMap<String, Ghost> ghosts;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();
    pacmans = new HashMap<String, PacMan>();
    ghosts = new HashMap<String, Ghost>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc))
      field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location

    // Given a name, location, and type, move the object and update

    JComponent component = this.components.get(name); // Simply a JComponent

    ArrayList<Location> valid_locations;

    // If we have a pacman, then I need a pacman

    if (type == Type.PACMAN) {
      PacMan current_pacman = this.pacmans.get(name);

      if (current_pacman == null) {
        PacMan man = new PacMan(name, loc, this);

        this.pacmans.put(name, man);

        current_pacman = man;
      }

      valid_locations = current_pacman.get_valid_moves();

      if (valid_locations.isEmpty()) {
        return false;
      } else {
        if (component != null) {
          component.setLocation(valid_locations.get(0).x, valid_locations.get(0).y);
        }
        return true;
      }
    } else if (type == Type.GHOST) {
      Ghost current_ghost = this.ghosts.get(name);

      if (current_ghost == null) {
        Ghost ghost = new Ghost(name, loc, this);

        this.ghosts.put(name, ghost);

        current_ghost = ghost;
      }

      valid_locations = current_ghost.get_valid_moves();

      if (valid_locations.isEmpty()) {
        return false;
      } else {
        if (component != null) {
          component.setLocation(valid_locations.get(0).x, valid_locations.get(0).y);
        }
        return true;

      }
    } else {
      return false;
    }
  }

 public HashSet<Type> getLoc(Location loc) {
    // wallSet and emptySet will help you write this method

    return field.get(loc);

    if (field.get(loc) == null) {
	return emptySet;
    } else if (loc.y < 0 || loc.x < 0 || loc.x > dim || loc.y > dim){
    	return wallSet;
    } else {
	return field.get(loc);
    }

  }

  public boolean attack(String Name) {
    // update gameOver
    gameOver = true;
    return gameOver;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    cookies++;
    Location location = locations.get(name);
    String id = "tok_x" + location.x + "_y" + location.y;
    JComponent cookieID = components.get(id);
    if (cookieID == null){
    return null;
    }else{
    locations.replace(id, null);
    components.remove(id);
    field.get(location).remove(Map.Type.COOKIE);

    return cookieID;
    }
  }
}
