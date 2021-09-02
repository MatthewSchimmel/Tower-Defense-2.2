import greenfoot.*;
public class eight extends Actor
{
    /**
     * Act - do whatever the eight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(upgradeScreen.timer == 0)
        {
            getWorld().removeObject(this);
        } else if (isTouching (one.class))
          {
            getWorld().removeObject(getOneIntersectingObject(one.class));
          }
        }
    }