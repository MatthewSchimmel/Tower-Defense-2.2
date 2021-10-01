import greenfoot.*;
public class player extends AnimatedActor
{
    //miscellaneous variables
    public static boolean destroyBoolean = false;
    public static int setFireRate = 45;
    public int wait = 0;
    public static int extraChances = 0;
    public static boolean pause = false;
    public static int kills = 0;
    public static int upgradePoints = 0;
    // the integers for current upgrades
    public static int playerSpeed = 3;
    public static int arrowDamage = 3;
    public int fireRate = 1;
    // integers for upgrade levels
    public static int fireRateUpgradeLevel = 1;
    public static int arrowDamageUpgradeLevel = 1;
    public static int playerSpeedUpgradeLevel = 1;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       animate();
       reload();
       upgrade();
       checkKills();
       spawnEnemy();
    }
    // probably re-code the following returns to be more efficient. Possibly an object?
    public static boolean pause()
    {
        return pause;
    }
        public static int getkill()
    {
       return kills;
    }
     public static int getArrowDamage()
    {
       return arrowDamage;
    }
     public static int setFireRate()
    {
       return setFireRate;
    }
    //now returning all upgrades variables
     public static int fireRateUpgradeLevel()
    {
       return fireRateUpgradeLevel;
    }
     public static int playerSpeedUpgradeLevel()
    {
       return playerSpeedUpgradeLevel;
    }
     public static int arrowDamageUpgradeLevel()
    {
       return arrowDamageUpgradeLevel;
    }
     public static int extraChances()
    {
       return extraChances;
    }
    public static int upgradePoints()
    {
       return upgradePoints;
    }
    public static int playerSpeed()
    {
       return playerSpeed;
    }
    public void animate()
    { // switches from default animation to moving animation accordingly
            if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")
            || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")
            || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")
            || (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")))
            {
                animateRUN(1,1);
                move();
            } else 
            {
                animateSTND(1,1);
            }
    }
    public void move() 
    {// moves the player around the allowed area
        if (pause == false)
        {
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-playerSpeed);
        }
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-playerSpeed,getY());
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+playerSpeed);
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+playerSpeed,getY());
        }
        if (getY() < 45) //pushes the player back into the allowed area if it moves too far
        {
            setLocation(getX(),getY()+playerSpeed);
        }
        if (getX() < 33) //pushes the player back into the allowed area if it moves too far
        {
            setLocation(getX()+playerSpeed,getY());
        }
        if (getX() > 175) //pushes the player back into the allowed area if it moves too far
        {
            setLocation(getX()-playerSpeed,getY());
        }
        if (getY() > 760) //pushes the player back into the allowed area if it moves too far
        {
            setLocation(getX(),getY()-playerSpeed);
        }
      }
    }
    public void fire() 
    {// allowes the player to fire his bow
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new arrow(),getX() + 3,getY() + 20);
            fireRate = setFireRate;
        }
    }
    public void reload()
    { //manages the time needed to reload before the next shot.
      if (pause == false)
      {
        if (fireRate==0)
        {
            fire();
        } else 
        {
            fireRate--;
        }
      }
    }
    public void checkKills() 
    {// at intervals of kills, gives the player another upgrade point and displays the options
        if (kills == 3)
        {
            upgradePoints++;
            pause = true;
            kills++;
            getWorld().addObject(new upgradeScreen(), 933,374);
        } else  if (kills == 7)
        {
            upgradePoints++;
            pause = true;
            kills++;
            getWorld().addObject(new upgradeScreen(), 933,374);
        } else  if (kills == 11)
        {
            upgradePoints++;
            pause = true;
            kills++;
            getWorld().addObject(new upgradeScreen(), 933,374);
        } else  if (kills == 15)
        {
            upgradePoints++;
            pause = true;
            kills++;
            getWorld().addObject(new upgradeScreen(), 933,374);
        } else  if (kills == 19)
        {
            upgradePoints++;
            pause = true;
            kills++;
            getWorld().addObject(new upgradeScreen(), 933,374);
        }
    }
    public void upgrade() // allows the player to spend his upgrade points
    {
        if (Greenfoot.isKeyDown("3") && upgradePoints > 0 && playerSpeedUpgradeLevel < 4)
        {
            playerSpeed = playerSpeed + 3;
            upgradePoints--;
            playerSpeedUpgradeLevel++;
            upgradeScreen.bolean = false;
            destroyBoolean = true;
        }
        if (Greenfoot.isKeyDown("2") && upgradePoints > 0 && arrowDamageUpgradeLevel < 4)
        {
            arrowDamageUpgradeLevel++;
            updateArrowDamage();
            upgradePoints--;
            upgradeScreen.bolean = false;
            destroyBoolean = true;
        }
        if (Greenfoot.isKeyDown("1") && upgradePoints > 0 && fireRateUpgradeLevel < 4)
        {
             setFireRate = setFireRate - 15;
             upgradePoints--;
             fireRateUpgradeLevel++;
             upgradeScreen.bolean = false;
             destroyBoolean = true;
        }
         if (Greenfoot.isKeyDown("4") && upgradePoints > 0)
        {
             upgradePoints--;
             extraChances++;
             upgradeScreen.bolean = false;
             destroyBoolean = true;
        }
    }
    public void updateArrowDamage() {
        if (arrowDamageUpgradeLevel == 2)
        {
            arrowDamage = 4;
        } else if (arrowDamageUpgradeLevel == 3)
        {
            arrowDamage = 6;
        } else if (arrowDamageUpgradeLevel == 4)
        {
            arrowDamage = 12;
        }
    }
    public void spawnEnemy() {//same with check kills method. possibly make if the number is divisible by three?
            if(pause == false)
        {
           wait++;
        }
        if (Greenfoot.isKeyDown("p"))
        {
            Greenfoot.stop();
        }
        // spawns waves of enemies using a new number guesser to reduce 'if' statements ran
        if(wait < 1750)
        {
            if(wait < 925 )
            {
                if(wait <150 )
                {            
                    if(wait == 70 )
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    } else if(wait == 120)
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    }
                }    else if(wait > 150 )
                    {
                    if(wait == 170 )
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    } else if(wait == 900)
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    }
                }
            }  else if(wait > 925)
                {
                    if(wait < 1030)
                    {
                        if(wait == 950)
                        {
                            getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                        } else if(wait == 1000)
                        {
                            getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                        }
                        } else if(wait > 1030)
                    {
                        if(wait == 1730)
                        {
                            getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                        } else if(wait == 1780)
                        {
                            getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                        }
                    }
                 }
        } else
        {
            if(wait < 1940 )
            {
                if(wait <= 1900)
                {
                    if(wait == 1830)
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    } else if(wait == 1880)
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    }
                } else if(wait == 1930)
                {
                    getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                }
            } else if(wait < 2900)
            {
                if(wait == 1950)
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    } else if(wait == 1980)
                    {
                        getWorld().addObject(new zombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    } else if(wait == 2899) // final boss
                    {
                    getWorld().addObject(new superzombie(),1599,Greenfoot.getRandomNumber(700)+100);
                    getWorld().addObject(new HealthBar(), 920,50);
                    }
            }
        }
    }
}