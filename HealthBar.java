import greenfoot.*;
import java.awt.Color; //not necessary in newer greefoot versions
public class HealthBar extends Actor
{
    int health = 100;
    int healthBarWidth = 1000;
    int healthBarHeight = 40;
    int sizeofdamage = healthBarWidth/health;
            /**
             * Act - do whatever the HealthBar wants to do. This method is called whenever
             * the 'Act' or 'Run' button gets pressed in the environment.
             */
    public HealthBar()
    {
        update();
    }

    public void act() 
    {
        update();
    }    

    public void update()
    {
        setImage(new GreenfootImage( healthBarWidth + 2, healthBarHeight +2 ));
        getImage().setColor (greenfoot.Color.WHITE);
        getImage().drawRect( 0, 0, healthBarWidth + 1, healthBarHeight + 1);
        getImage().setColor(greenfoot.Color.RED);
        getImage().fillRect(1,1, superzombie.health * sizeofdamage, healthBarHeight);
    }
}