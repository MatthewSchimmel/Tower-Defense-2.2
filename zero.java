import greenfoot.*;
public class zero extends Actor
{
    /**
     * Act - do whatever the zero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(upgradeScreen.timer == 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
