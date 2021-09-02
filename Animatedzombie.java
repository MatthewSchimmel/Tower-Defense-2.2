import greenfoot.*;
/**
 * credit to tanner crow for the code in this class.
 */
public class Animatedzombie extends Actor
{
     public int zframe = 1;                 //current zframe
     private String name = "zombie";	      //base name for image
     private String extension = ".png";	 //file extension
     private int speed = 10;		        //speed of animation
     private int speedCounter = 0;
    /**
     * Act - do whatever the Animatedzombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
        public void animateZOMB(int zombie1,int zombie4)	//first zframe e.g. 0, last zframe e.g. 3
    {
        if (speedCounter >= speed)		//Only animate when counter has reached speed
        {
            speedCounter = 1;		//reset counter
            if (zframe < 1 || zframe >= 2)	//if the zframe is outside the first/last range
            {
                zframe = 1;		//set to first zframe
            }
            else
            {
                zframe++;			//otherwise add 1 to the zframe number
            }
            setImage(name + zframe + extension);
        }

        else
        {
            speedCounter++;		//if  counter not up to speed add 1 to counter
        }
    }
}
