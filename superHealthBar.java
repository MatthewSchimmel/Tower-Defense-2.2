import greenfoot.*;
import java.awt.Color; //not necessary in newer greefoot versions
public class superHealthBar extends Actor
{
    int health = 100;
    int healthBarWidth = 1000;
    int healthBarHeight = 40;
    int sizeofdamage = healthBarWidth/health;
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