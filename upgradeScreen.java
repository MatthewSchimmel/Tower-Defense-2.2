import greenfoot.*;
public class upgradeScreen extends Actor
{
    public static boolean bolean = false;
    public boolean runDown = false;
    public static int timer = 70;
    public void act() 
    {
        fillIn();
        remove();
    }
     public static int timer()
    {
       return timer;
    }
     public static boolean bolean()
    {
       return bolean;
    }
    public void remove()
    {
        if (player.destroyBoolean == true) // the timer will start to run down
        {
            bolean = false;
            runDown = true;
            player.destroyBoolean = false;
        }
        if (runDown == true)  // if this boolean made true, the timer will start running down.
        {
            timer --;
        }
        if (timer == -1)
        {
            runDown = false;
            timer = 60;
            getWorld().removeObject(getOneIntersectingObject(one.class));
            getWorld().removeObject(getOneIntersectingObject(two.class));
            getWorld().removeObject(getOneIntersectingObject(three.class));
            getWorld().removeObject(getOneIntersectingObject(four.class));
            getWorld().removeObject(getOneIntersectingObject(five.class));
            getWorld().removeObject(getOneIntersectingObject(six.class));
            getWorld().removeObject(getOneIntersectingObject(seven.class));
            getWorld().removeObject(getOneIntersectingObject(eight.class));
            getWorld().removeObject(getOneIntersectingObject(nine.class));
            bolean = false;
            player.pause = false;
            getWorld().removeObject(this);
        }
    }
    public void fillIn()
    {
      if (bolean == false)
      {
        // fire rate
        if (player.fireRateUpgradeLevel == 1)
        {
            getWorld().addObject(new one(),1257,288);
        }
        if (player.fireRateUpgradeLevel == 2)
        {
            getWorld().addObject(new two(),1257,288);
        }
        if (player.fireRateUpgradeLevel == 3)
        {
            getWorld().addObject(new three(),1257,288);
        }
        if (player.fireRateUpgradeLevel == 4)
        {
            getWorld().addObject(new max(),1257,288);
        }
        // arrow damage
        if (player.arrowDamageUpgradeLevel == 1)
        {
            getWorld().addObject(new one(),1257,392);
        }
        if (player.arrowDamageUpgradeLevel == 2)
        {
            getWorld().addObject(new two(),1257,392);
        }
        if (player.arrowDamageUpgradeLevel == 3)
        {
            getWorld().addObject(new three(),1257,392);
        }
        if (player.arrowDamageUpgradeLevel == 4)
        {
            getWorld().addObject(new max(),1257,392);
        }
        // speed
        if (player.playerSpeedUpgradeLevel == 1)
        {
            getWorld().addObject(new one(),1257,508);
        }
        if (player.playerSpeedUpgradeLevel == 2)
        {
            getWorld().addObject(new two(),1257,508);
        }
        if (player.playerSpeedUpgradeLevel == 3)
        {
            getWorld().addObject(new three(),1257,508);
        }
        if (player.playerSpeedUpgradeLevel == 4)
        {
            getWorld().addObject(new max(),1257,508);
        }
        //extra chances
        if (player.extraChances == 0)
        {
            getWorld().addObject(new zero(),1257,632);
        }
        if (player.extraChances == 1)
        {
            getWorld().addObject(new one(),1257,632);
        } else if (player.extraChances == 2)
        {
            getWorld().addObject(new two(),1257,632);
        } else if (player.extraChances == 3)
        {
            getWorld().addObject(new three(),1257,632);
        } else if (player.extraChances == 4)
        {
            getWorld().addObject(new four(),1257,632);
        } else if (player.extraChances == 5)
        {
            getWorld().addObject(new five(),1257,632);
        } else if (player.extraChances == 6)
        {
            getWorld().addObject(new six(),1257,632);
        } else if (player.extraChances == 7)
        {
            getWorld().addObject(new seven(),1257,632);
        } else if (player.extraChances == 8)
        {
            getWorld().addObject(new eight(),1257,632);
        } else if (player.extraChances == 9)
        {
            getWorld().addObject(new nine(),1257,632);
        }
        else if (player.extraChances == 10)
        {
            getWorld().addObject(new max(),1257,632);
        }
        bolean = true;
      }
    }
}
