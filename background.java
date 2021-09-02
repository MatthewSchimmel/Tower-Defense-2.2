import greenfoot.*;

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 1600x800 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        player player = new player();
        addObject(player, 112, 281);
        instructions instructions = new instructions();
        addObject(instructions, 857, 374);
    }
}
