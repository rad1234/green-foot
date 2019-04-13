import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poveste2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poveste2 extends World
{

    /**
     * Constructor for objects of class poveste2.
     * 
     */
    public poveste2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 540, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        fortareata fortareata = new fortareata();
        addObject(fortareata,567,392);
        fortareata.setLocation(563,381);
        fortareata.setLocation(546,344);
        fortareata.setLocation(496,293);
        CONTINUA continua = new CONTINUA();
        addObject(continua,769,500);
        nr2 nr2 = new nr2();
        addObject(nr2,263,127);
        continua.setLocation(760,472);
        CONTINUA2 continua2 = new CONTINUA2();
        addObject(continua2,785,483);
        removeObject(continua2);
        removeObject(continua);
        CONTINUA2 continua23 = new CONTINUA2();
        addObject(continua23,767,488);
    }
}
