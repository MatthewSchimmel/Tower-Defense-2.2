import greenfoot.*;

/**
 * Write a description of class thirdHealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oneThirdHealthBar extends Actor
{
    boolean bolean = false;
    /**
     * Act - do whatever the oneFourthHealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        selfDestruct();
    }    
    public void selfDestruct()
    {
       if (bolean = false)
       {
           bolean = true;
        } else
        {
            getWorld().removeObject(this);
        }
    }
}