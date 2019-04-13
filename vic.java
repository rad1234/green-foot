import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vic extends World
{

    /**
     * Constructor for objects of class vic.
     * 
     */
    public vic()
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
        hapi2 hapi2 = new hapi2();
        addObject(hapi2,358,289);
        hapi2.setLocation(352,284);
        hapi hapi = new hapi();
        addObject(hapi,750,290);
        hapi.setLocation(744,284);
        tryagin tryagin2 = new tryagin();
        addObject(tryagin2,588,495);
        tryagin2.setLocation(555,492);
    }
}
