import greenfoot.*;
public class zombie extends Animatedzombie
{
    int health = 12;
    /**
     * Act - do whatever the zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        loseTheGame();
        move();
        update();
        die();
        animateZOMB(0,0);

    }    
    public void die() // facilitates the taking damage and dying feature
    {
         if (isTouching (arrow.class) && player.pause == false)
        {
            getWorld().removeObject(getOneIntersectingObject(arrow.class));
            health = health - player.arrowDamage;
        }
        if (health < 1)
        {
            player.kills++;
            getWorld().removeObject(this);
        }
    }
    public void loseTheGame() //ensures that the game is lost if the enemy gets too close
    {
        if (getX() < 250)
        {
            if (player.extraChances >= 1)
            {   setLocation(1599,getY());
                player.extraChances --;
            } else
            {
                getWorld().addObject(new fail(), 800,400);
                Greenfoot.stop();
            }
        }
    }
    public void move() // moves
    {
        if (player.pause == false)
        {
            move(-1);
        }
    }
    public void update()
    {
        if (health == 12)
       {
           getWorld().addObject(new fullHealthBar(),getX(),getY() -50);
       } else if (health == 9)
       {
           getWorld().addObject(new threeFourthHealthBar(),getX(),getY() -50);
       } else if (health == 6)
       {
           getWorld().addObject(new oneHalfHealthBar(),getX(),getY() -50);
       } else if (health == 4)
       {
           getWorld().addObject(new oneThirdHealthBar(),getX(),getY() -50);
       } else if (health == 8)
       {
           getWorld().addObject(new twoThirdHealthBar(),getX(),getY() -50);
       } else if (health == 3)
       {
           getWorld().addObject(new oneFourthHealthBar(),getX(),getY() -50);
       }
    }
}