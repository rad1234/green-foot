import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShootingManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootingManager extends Actor
{
    /**
     * Act - do whatever the ShootingManager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        omoaraEnemy();
    }    
    public void remove()
    {
        Actor walls = getOneIntersectingObject(plt.class);
        Actor walls2  = getOneIntersectingObject(pltut.class);
        if(getX() <= 1 || getX() >= getWorld().getWidth() -1)
        {
            getWorld().removeObject(this);          
        }
        else if(walls != null || walls2 != null)
        {
            getWorld().removeObject(this);          
        }
    }
    
    public boolean rUshot(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0,0, clss);
        return actor != null;
    }
    
    public void omoara(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0,0, clss);
        if(actor != null)
        {
            getWorld().removeObject(actor);
            ((Score) getWorld().getObjects(Score.class).get(0)).add(1);
        }
    }
    public void omoaraEnemy()
    {
        if(rUshot(Enemy.class))
        {
            omoara(Enemy.class);
            getWorld().removeObject(this);
        }
        else 
        {
            remove();
        }
    }
 
    
}
