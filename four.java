import greenfoot.*;
public class four extends Actor
{
    boolean selfDestruct = false;
    /**
     * Act - do whatever the four wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(upgradeScreen.timer == 0)
        {
            getWorld().removeObject(this);
        } else if (isTouching (three.class))
          {
            getWorld().removeObject(getOneIntersectingObject(three.class));
          }
          if (selfDestruct == true)
        {
            getWorld().removeObject(this);
        } else if (selfDestruct == false)
        {
            getWorld().removeObject(this);
        }
        }
    }    