import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tryagin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tryagin extends butoane
{
    /**
     * Act - do whatever the tryagin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       public tryagin()
       {
           GreenfootImage image = getImage();
           image.scale(200,100);
           setImage(image);
        }
    public void act() 
    {
       if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
    }    
}
