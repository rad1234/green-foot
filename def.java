import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class def here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class def extends World
{

    /**
     * Constructor for objects of class def.
     * 
     */
    public def()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        sed sed = new sed();
        addObject(sed,604,284);
        sed.setLocation(596,277);
        sed2 sed2 = new sed2();
        addObject(sed2,542,279);
        sed.setLocation(595,279);
        tryagin tryagin = new tryagin();
        addObject(tryagin,577,493);
        tryagin.setLocation(564,500);
        sed.setLocation(614,279);
        sed.setLocation(610,279);
    }
}
