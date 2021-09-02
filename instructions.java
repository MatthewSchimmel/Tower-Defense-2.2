import greenfoot.*;
public class instructions extends Actor
{
    Color clear = new Color(255, 255, 255 , 0);
    /**
     * Act - do whatever the Car_wins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public instructions() 
    {
        setImage (new GreenfootImage("-Use WASD or the arrow keys to move.\n-Hold space to fire.\n-Kill the zombies\n-Press P to pause.", 50, greenfoot.Color.BLACK,clear));
    }
    public void act()
    { 
         getWorld().removeObject(this);
    }
}

