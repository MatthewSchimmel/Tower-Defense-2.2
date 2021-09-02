import greenfoot.*;
public class superzombie extends AnimatedSzombie
{
    public static int health = 100;
    /**
     * Act - do whatever the zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public void act() 
    {
        move();
        loseTheGame();
        die();
        animateSZOMB(0,0);
    } 
    public static int getHealth()
        {
            return health;
        }
    public void move()
    {
        if (player.pause == false)
        {
            move(-1);
        }
    }
    public void loseTheGame() //ensures that the game is lost if the enemy gets too close
    {
        if (getX() < 250)
        {
            if (player.extraChances >= 1)
            {
                player.extraChances --;
                setLocation(1599,getY());
            } else
            {
                getWorld().addObject(new fail(), 800,400);
                Greenfoot.stop();
            }
        }
    }
    public void die()
    {
         if (isTouching (arrow.class) && player.pause == false)
        {
            getWorld().removeObject(getOneIntersectingObject(arrow.class));
            health = health - player.arrowDamage;
        }
        if (health < 1)
        {
            getWorld().addObject(new win(), 800,400);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}