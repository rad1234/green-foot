import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Felicitari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Felicitari extends Instructiuni
{
    /**
     * Act - do whatever the Felicitari wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
 
        // Add your action code here.
    }    
}
