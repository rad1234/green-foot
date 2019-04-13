import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trage extends Instructiuni
{
    /**
     * Act - do whatever the trage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(Greenfoot.isKeyDown("X"))
        {
            Felicitari f = new Felicitari();
            getWorld().addObject(f, 350,70);
            getWorld().removeObject(this);
        }
    }
        
        // Add your action code here.
    }
   
