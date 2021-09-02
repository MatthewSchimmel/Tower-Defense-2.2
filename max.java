import greenfoot.*;

/**
 * Write a description of class max here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class max extends Actor
{
    /**
     * Act - do whatever the max wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeOthers();
        selfDestruct();
    }    
    public void removeOthers() // removes other numbers in its way.
    {
        getWorld().removeObject(getOneIntersectingObject(one.class));
        getWorld().removeObject(getOneIntersectingObject(two.class));
        getWorld().removeObject(getOneIntersectingObject(three.class));
        getWorld().removeObject(getOneIntersectingObject(four.class));
        getWorld().removeObject(getOneIntersectingObject(five.class));
        getWorld().removeObject(getOneIntersectingObject(six.class));
        getWorld().removeObject(getOneIntersectingObject(seven.class));
        getWorld().removeObject(getOneIntersectingObject(eight.class));
        getWorld().removeObject(getOneIntersectingObject(nine.class));
    }
    public void selfDestruct()
    {
        if(upgradeScreen.timer == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
