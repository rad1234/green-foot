import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buton extends butoane
{
    
    /**
     * Act - do whatever the Buton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(203,220);
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        // Add your action code here.
     }
}
