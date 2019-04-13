import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BunVenit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BunVenit extends Instructiuni
{
    /**
     * Act - do whatever the BunVenit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
             Greenfoot.setWorld(new Tutorial());
        }
        // Add your action code here.
    }   
    
}
