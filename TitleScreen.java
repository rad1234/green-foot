import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Cr(eate a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 540 , 1); 
        Greenfoot.start();
        prepare();
    }
   

    private void prepare()
    {
        Buton button = new Buton();
        addObject(button, 693, 315);
        Howtoplay howtoplay = new Howtoplay();
        addObject(howtoplay,702,456);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
     
}
