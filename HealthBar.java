import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class HealthBar extends Actor
{
    int num = 2;
    int health = 20;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint = healthBarWidth/health;
    public void HealthBar(){
        draw();
    }
    public void act()
    {
        draw();
        destruct();
    }
    public void draw(){
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, health * pixelsPerHealthPoint, healthBarHeight);
    }
    public void destruct(){
        if (num < 0)
        {
            getWorld().removeObject(this);
        }
         else
        {
           num--;
        }
    }
}