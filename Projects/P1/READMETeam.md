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

## Ghost

Function: get_valid_moves(): This function returns an array list with the valid coordinates that a given pacman can move. We decided to move a ghost if the spaces available aren't walls. If a space includes a wall it is not included in the list of available coordinates. 

Test: To test this we simply inputted a map and a ghost with some walls, similar to the tests for pacman. We made the map so we could determine where the pacman, and where the walls, were in the map. This allowed us to check that specific coordinates come back when running the function.

## Map

Function: move(String name, Location loc, Type type): This function returns a boolean value depicting whether or not a given component type is able to move given a specified location. This function relies heavily on the get_valid_moves() of both the ghost and pacman classes.

Test: To test this function we operated similar to the get_valid_moves() tests, and ensured that when valid moves were present, the function returned true. 
