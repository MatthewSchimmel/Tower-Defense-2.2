import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class HealthBar extends Actor
{
    boolean yesno = false;
    public void HealthBar(int health){
        int realhealth = health;
    }
    public void act()
    {
       final int tempHealth = 12; //only value it seems to align with
       final int healthBarWidth = 60; //only value it seems to align with
       final int healthBarHeight = 10;
       final int pixelsPerHealthPoint = healthBarWidth/tempHealth;
       GreenfootImage myImage = getImage();
       myImage.setColor(Color.WHITE);
       myImage.drawRect(14, -10, healthBarWidth + 1, healthBarHeight + 1);
       myImage.setColor(Color.RED);
       myImage.fillRect(1, 1, 12 * pixelsPerHealthPoint, healthBarHeight);
        remove();
    }
    public void remove(){
        if (yesno == false){
            yesno = true;
        } else {
            getWorld().removeObject(this);
        }
    }
}