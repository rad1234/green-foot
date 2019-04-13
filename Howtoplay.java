import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Howtoplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Howtoplay extends butoane
{
    /**
     * Act - do whatever the Howtoplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(368,484);
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new BunVenitTut());
        }
    }    
}
