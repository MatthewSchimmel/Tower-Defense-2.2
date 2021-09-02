import greenfoot.*;
public class AnimatedActor extends Actor
{
    public int frame = 1;                 //current frame
    private String name = "Standing";         //base name for image
    private String extension = ".png";   //file extension
    private int Xspeed = 9;             //speed of animation
    private int XspeedCounter = 0;
    ///////////////////////Int separation, separates one animation's ints from the next.
    public int Yframe = 1;                 //current frame
    private String Yname = "Running";         //base name for image
    private String Yextension = ".png";  //file extension
    private int Yspeed = 3;             //speed of animation
    private int YspeedCounter = 0;
    /**
     * Act - do whatever the AnimatedActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }
   public void animateRUN(int Running1,int Running10)  //first frame e.g. 0, last frame e.g. 3
    {
        if (YspeedCounter >= Yspeed)        //Only animate when counter has reached speed
        {
            YspeedCounter = 0;      //reset counter
            if (Yframe < 1 || Yframe >= 10) //if the frame is outside the first/last range
            {
                Yframe = 1;     //set to first frame
            }
            else
            {
                Yframe++;           //otherwise add 1 to the frame number
            }
            setImage(Yname + Yframe + Yextension);  //display the next image
        }

        else
        {
            YspeedCounter++;        //if  counter not up to speed add 1 to counter
        }
    }
   public void animateSTND(int Standing1,int Standing12)   //first frame e.g. 0, last frame e.g. 3
    {
        if (XspeedCounter >= Xspeed)        //Only animate when counter has reached speed
        {
            XspeedCounter = 0;      //reset counter
            if (frame < 1 || frame >= 12)   //if the frame is outside the first/last range
            {
                frame = 1;      //set to first frame
            }
            else
            {
                frame++;            //otherwise add 1 to the frame number
            }
            setImage(name + frame + extension);  //display the next image
        }

        else
        {
            XspeedCounter++;        //if  counter not up to speed add 1 to counter
        }
    }
}
