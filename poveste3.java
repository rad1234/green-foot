import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poveste3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poveste3 extends World
{

    /**
     * Constructor for objects of class poveste3.
     * 
     */
    public poveste3()
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
        incepe incepe = new incepe();
        addObject(incepe,758,460);
        fortareata fortareata = new fortareata();
        addObject(fortareata,448,300);
        rau rau2 = new rau();
        addObject(rau2,747,296);
        rau2.setLocation(176,264);
        bun bun2 = new bun();
        addObject(bun2,749,304);
        fortareata.setLocation(459,270);
        nr3 nr3 = new nr3();
        addObject(nr3,293,124);
    }
}
