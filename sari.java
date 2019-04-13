import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sari extends Instructiuni
{
    /**
     * Act - do whatever the sari wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("space"))
        {
            trage t = new trage();
            getWorld().addObject(t, 200,400);
            getWorld().removeObject(this);
        }
 
               
        // Add your action code here.
    }
}

