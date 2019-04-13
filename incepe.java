import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class incepe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class incepe extends story
{
    /**
     * Act - do whatever the incepe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
        // Add your action code here.
    }    
}
