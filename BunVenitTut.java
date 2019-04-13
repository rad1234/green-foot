import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BunVenitTut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BunVenitTut extends World
{

    /**
     * Constructor for objects of class BunVenitTut.
     * 
     */
    private void incepe()
    {
        BunVenit BunVenit= new BunVenit();
        addObject(BunVenit, 400, 100);
        BunVenit.setLocation(470, 250);
    }
    public BunVenitTut()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 540, 1); 
        incepe();
    }
}
