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
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean attack(String Name) {
    // update gameOver
    gameOver = true;
    return gameOver;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    Location location = locations.get(name);
    if (field.get(location)!=null){
      field.get(location).remove(Map.Type.COOKIE);
    } else {
      return null;
    }

    String cookieName = "tok_x" + location.x + "_y" + location.y;
    JComponent cookieID = components.remove(cookieName);
    if (cookieID == null){
      return null;
    }
    cookies++;
    locations.remove(cookieName);

    return cookieID;
  }
}
