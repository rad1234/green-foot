import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class badRobo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class badman extends Enemy
{
    private int vSpeed = 0;
    private int acceleration = 2;
    
    private int badHeight = getImage().getHeight();
    private int badWidth = getImage().getWidth();
    private int lookForGroundDistance = (int)badHeight/2;
    private int lookForEdge= (int)badWidth/2;
    
    private int speed = 1;
    
    int frame = 0;
    private int animationCount;
    
    GreenfootImage wd0 = new GreenfootImage("wd0.png");
    GreenfootImage wd1 = new GreenfootImage("wd1.png");
    GreenfootImage wd2 = new GreenfootImage("wd2.png");
    GreenfootImage wd3 = new GreenfootImage("wd3.png");
    GreenfootImage wd4 = new GreenfootImage("wd4.png");
    GreenfootImage wd5 = new GreenfootImage("wd5.png");
    GreenfootImage wd6 = new GreenfootImage("wd6.png");
    GreenfootImage wd7 = new GreenfootImage("wd7.png");
    
    GreenfootImage ws0 = new GreenfootImage("ws0.png");
    GreenfootImage ws1 = new GreenfootImage("ws1.png");
    GreenfootImage ws2 = new GreenfootImage("ws2.png");
    GreenfootImage ws3 = new GreenfootImage("ws3.png");
    GreenfootImage ws4 = new GreenfootImage("ws4.png");
    GreenfootImage ws5 = new GreenfootImage("ws5.png");
    GreenfootImage ws6 = new GreenfootImage("ws6.png");
    GreenfootImage ws7 = new GreenfootImage("ws7.png");
    public void act() 
    {
        checkFall();
        move();
        checkRightWalls();
        checkLeftWalls();
        
        if(speed<0)
        {
            if((animationCount % 8) == 0)
            animateLeft();
        }
        else
        {
            if((animationCount % 8) == 0)
            animateRight();
        }
        animationCount++;
    }    

    public void move()
    {
        Actor ground = getOneObjectAtOffset(lookForEdge, lookForGroundDistance, pltut.class);
        
        if((ground == null)||(checkRightWalls()) == true)
        {
            speed *= -1;
            lookForEdge *= -1;
        }
        else 
        {
            move(speed);
        }

    }
public void animateLeft()
{
    if(frame == 0)
    {
     setImage(ws0);   
    }
    else if(frame == 1)
    {
        setImage(ws1);
    }
    else if(frame == 2)
    {
        setImage(ws2);
    }
    else if(frame == 3)
    {
        setImage(ws3);
    }
    else if(frame == 4)
    {
        setImage(ws4);
    }
     else if(frame == 5)
    {
        setImage(ws5);
    }
     else if(frame == 6)
    {
        setImage(ws6);
    }
    else if(frame == 7)
    {
        setImage(ws7);
        frame = 0;
    }
    frame++;
}
public void animateRight()
{
    if(frame == 0)
    {
     setImage(wd0);   
    }
    else if(frame == 1)
    {
        setImage(wd1);
    }
    else if(frame == 2)
    {
        setImage(wd2);
    }
    else if(frame == 3)
    {
        setImage(wd3);
    }
    else if(frame == 4)
    {
        setImage(wd4);
    }
     else if(frame == 5)
    {
        setImage(wd5);
    }
     else if(frame == 6)
    {
        setImage(wd6);
    }
    else if(frame == 7)
    {
        setImage(wd7);
        frame = 0;
    }
    frame++;
}

public void fall()
{
    setLocation(getX(), getY() + vSpeed);
    if(vSpeed <= 9)
    {
        vSpeed = vSpeed + acceleration;
    }
}
public boolean onGround()
{ 
    int caracterHeight = getImage().getHeight();
    int lookForGround = (int) (caracterHeight/2 + 5);
    
    Actor ground = getOneObjectAtOffset(0, lookForGround, pltut.class);
    if(ground == null)
    {
       
        return false;
    }
    else
    {
       moveToGround(ground);
      return true;
    }
}
public void checkFall()
{
    if(onGround())
    {
     vSpeed = 0;   
    }
    else 
    fall();
}

public void moveToGround(Actor ground)
{
  int groundHeight = ground.getImage().getHeight();
  int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
  
  setLocation(getX(), newY);
  
}
public boolean checkRightWalls()
{
    int caracterWidth = getImage().getWidth();
    int xDistance = (int)(caracterWidth/2 -20);
    Actor rightWall = getOneObjectAtOffset(xDistance, 0, pltut.class);
    if(rightWall == null)
    {
        return false;
    }
    else
    {
       stopByRightWall(rightWall);
       return true;      
    }
}
public void stopByRightWall(Actor rightWall)
{
    int wallWidth = rightWall.getImage().getWidth();
    int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
    setLocation(newX - 5, getY());
    speed = -1;
    lookForEdge = -1;
    
}
public boolean checkLeftWalls()
{
    int caracterWidth = getImage().getWidth();
    int xDistance = (int)(caracterWidth/2 - 40);
    Actor leftWall = getOneObjectAtOffset(xDistance, 0, pltut.class);
    if(leftWall == null)
    {
        return false;
    }
    else
    {
       stopByLeftWall(leftWall);
       return true;
    }
}
public void stopByLeftWall(Actor leftWall)
{
    int wallWidth = leftWall.getImage().getWidth();
    int newX = leftWall.getX() + ( wallWidth + getImage().getWidth())/2;
    setLocation(newX - 5, getY());
    speed = 1;
    lookForEdge = 1;
    
}

}
