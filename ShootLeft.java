import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShootLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootLeft extends ShootingManager
{
    private int shootingSpeed = 8;
    /**
     * Act - do whatever the ShootLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        zbr();
        omoaraEnemy();
    }   
    public ShootLeft()
       {
           GreenfootImage image = getImage();
           image.scale(20,40);
           setImage(image);
        }
        public void zbr()
    {
        setLocation(getX() - shootingSpeed, getY());
    }
}
