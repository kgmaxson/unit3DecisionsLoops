import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @kgmaxson
 * @version 20 November 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 20 rows and 20 columns
    private final int ROWS = 20;
    private final int COLS = 20;
    
    // constants for the location of the twelve cells initially alive
    private final int X1 = 10, Y1 = 10;
    private final int X2 = 10, Y2 = 13;
    private final int X3 = 11, Y3 = 11;
    private final int X4 = 11, Y4 = 12;
    private final int X5 = 12, Y5 = 10;
    private final int X6 = 12, Y6 = 12;
    private final int X7 = 12, Y7 = 14;
    private final int X8 = 13, Y8 = 11;
    private final int X9 = 13, Y9 = 12;
    private final int X10 = 14, Y10 = 10;
    private final int X11 = 14, Y11 = 12;
    private final int X12 = 14, Y12 = 13;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the twelve intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(X9, Y9);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(X10, Y10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(X11, Y11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(X12, Y12);
        grid.put(loc12, rock12);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        //new grid
        BoundedGrid<Actor> grid2 = new BoundedGrid<Actor>(ROWS, COLS);
        
        //enter code
        for (int x=0;x<COLS;x++)
        {
            for (int y=0;y<ROWS;y++)
            {
                Location loc = new Location(x,y);
                int neighbors = grid.getNeighbors(loc).size();
                if (getActor(x,y)==null) //dead cell
                {
                    if (neighbors==3)
                    {
                        //make alive
                        grid2.put(new Location(x,y), new Rock());
                    }
                }
                if (getActor(x,y)!=null) //alive cell
                {
                    if (neighbors==3||neighbors==2)
                    {
                      //keep alive  
                      grid2.put(new Location(x,y), new Rock());
                    }
                    else
                    {
                        //make dead
                    }
                }
            }
        }
        world.setGrid(grid2);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String args[])
        throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        int count =1;
        for (int x=0;x<1000;x++) //run 100 iterations
        {
            Thread.sleep(100); // sleep 5000 milliseconds (.5 second)
            game.createNextGeneration();
            count ++;
            System.out.println(count);
        }
    }

}
