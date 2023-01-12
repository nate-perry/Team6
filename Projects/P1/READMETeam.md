Pacman Project Team 6

Tyler Jenkins, Hamzah Siddique, Arnav Shivansh, and Neil Hajela

Picture of code running:

Insert Here

## How to run from command line:

```bash
insert here
```

## Functions written:

## Pacman

get_valid_moves(): 

Function: This function returns an array list with the valid coordinates that a given pacman can move. We decided to move a pacman if the spaces available aren't walls or ghosts. If a space includes a wall or a ghost it is not included in the list of available coordinates. 

Test: To test this we simply inputted a map and a pacman with some walls. We made the map so we could determine where the pacman, and where the walls, were in the map. This allowed us to check that specific coordinates come back when running the function.

Function: move(): This function will move the pacman object to the 1st item in the possible moves array list provided from the get_valid_moves() function. It will return true if it was able to move, and false if there were no possible moves.

Test: To test this created a map and checked if it could move after being spawned in to the center of the empty map. It returns true if it was able to move and false if not.

Function consume(): This function will remove/consume a cookie component if it is at the same location as pacman. It returns the cookie component if it was successfully consumed and null otherwise.

Test: To test this we created a map which had pacman and a cookie at the same location. The test will assert that the cookie component was returned.

## Ghost

Function: get_valid_moves(): This function returns an array list with the valid coordinates that a given pacman can move. We decided to move a ghost if the spaces available aren't walls. If a space includes a wall it is not included in the list of available coordinates. 

Test: To test this we simply inputted a map and a ghost with some walls, similar to the tests for pacman. We made the map so we could determine where the pacman, and where the walls, were in the map. This allowed us to check that specific coordinates come back when running the function.

Function: move(): This function will move a ghost object to the 1st possible move provided by the get_valid_moves() function for the ghost class. This function will return true if the array list had a possible move and false if the array list provided from get_valid_moves() was empty.

Test: To test this, created an empty map and tested if the ghost could move after being spawned into the center of the map. returns true if it was able too and false if not.

Function attack(): This function will allow the ghost to attack pacman if pacman is in range. It returns true only if the attack was successful and false otherwise.

Test: To test this we created a map with a ghost adjacent to pacman so that the ghost is in range. This test will assert that the attack was successful.

## Map

Function: move(String name, Location loc, Type type): This function returns a boolean value depicting whether or not a given component type is able to move given a specified location. This function relies heavily on the get_valid_moves() of both the ghost and pacman classes.

Test: To test this function we operated similar to the get_valid_moves() tests, and ensured that when valid moves were present, the function returned true. 

Function: getLoc(Location loc): Returns the enum type that in the specified location on the Map object.

Test: Creates an empty map and checks if the location of the center of the map is empty.

Function attack(): This function will allow the ghost to attack pacman if pacman is in range. The gameOver variable is also updated. It returns true only if the attack was successful and false otherwise. 

Test: To test this we created a map with a ghost adjacent to pacman so that the ghost is in range. This test will assert that the attack was successful.