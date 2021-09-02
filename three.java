import greenfoot.*;
public class three extends Actor
{
    /**
     * Act - do whatever the three wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(upgradeScreen.timer == 0)
        {
            getWorld().removeObject(this);
        } else if (isTouching (two.class))
          {
            getWorld().removeObject(getOneIntersectingObject(two.class));
          }
    }    
}
