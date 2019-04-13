import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poveste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poveste extends World
{

    /**
     * Constructor for objects of class poveste.
     * 
     */
    public Poveste()
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
        nr1 nr1 = new nr1();
        addObject(nr1,292,151);
        rau rau = new rau();
        addObject(rau,442,318);
        bun bun = new bun();
        addObject(bun,605,376);
        bun.setLocation(621,352);
        bun.setLocation(624,365);
        bun.setLocation(609,367);
        rau.setLocation(442,310);
        bun.setLocation(618,374);
        CONTINUA continua = new CONTINUA();
        addObject(continua,793,496);
        continua.setLocation(796,468);
        rau.setLocation(308,283);
        bun.setLocation(546,315);
        bun.setLocation(487,332);
        rau.setLocation(269,259);
        bun.setLocation(490,336);
    }
}
