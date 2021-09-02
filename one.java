import greenfoot.*;
public class one extends Actor
{
    /**
     * Act - do whatever the one wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(upgradeScreen.timer == 0)
        {
            getWorld().removeObject(this);
        }else   if (isTouching (zero.class))
          {
            getWorld().removeObject(getOneIntersectingObject(zero.class));
          }
    }    
}
