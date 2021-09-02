import greenfoot.*;
public class arrow extends player
{
    /**
     * Act - do whatever the arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shoot();
        gooffscreen();
    }  
    public void shoot()
    {
       if (player.pause == false)
       {
           setLocation(getX() + 9,getY());
       }
    }
    public void gooffscreen()
    {
        if (getX() == 1599)
        {
            getWorld().removeObject(this);
        }
    }
}