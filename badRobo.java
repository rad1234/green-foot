import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class badRobo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class badRobo extends Enemy
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
    
    GreenfootImage ef1 = new GreenfootImage("ef1.png");
    GreenfootImage ef2 = new GreenfootImage("ef2.png");
    GreenfootImage ef3 = new GreenfootImage("ef3.png");
    GreenfootImage ef4 = new GreenfootImage("ef4.png");
    GreenfootImage ef5 = new GreenfootImage("ef5.png");
    GreenfootImage ef6 = new GreenfootImage("ef6.png");
    GreenfootImage ef7 = new GreenfootImage("ef7.png");
    GreenfootImage ef8 = new GreenfootImage("ef8.png");
    
    GreenfootImage es1 = new GreenfootImage("es1.png");
    GreenfootImage es2 = new GreenfootImage("es2.png");
    GreenfootImage es3 = new GreenfootImage("es3.png");
    GreenfootImage es4 = new GreenfootImage("es4.png");
    GreenfootImage es5 = new GreenfootImage("es5.png");
    GreenfootImage es6 = new GreenfootImage("es6.png");
    GreenfootImage es7 = new GreenfootImage("es7.png");
    GreenfootImage es8 = new GreenfootImage("es8.png");
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
        Actor ground = getOneObjectAtOffset(lookForEdge, lookForGroundDistance, plt.class);
        
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
     setImage(es1);   
    }
    else if(frame == 1)
    {
        setImage(es2);
    }
    else if(frame == 2)
    {
        setImage(es3);
    }
    else if(frame == 3)
    {
        setImage(es4);
    }
    else if(frame == 4)
    {
        setImage(es5);
    }
     else if(frame == 5)
    {
        setImage(es6);
    }
     else if(frame == 6)
    {
        setImage(es7);
    }
    else if(frame == 7)
    {
        setImage(es8);
        frame = 0;
    }
    frame++;
}
public void animateRight()
{
    if(frame == 0)
    {
     setImage(ef1);   
    }
    else if(frame == 1)
    {
        setImage(ef2);
    }
    else if(frame == 2)
    {
        setImage(ef3);
    }
    else if(frame == 3)
    {
        setImage(ef4);
    }
    else if(frame == 4)
    {
        setImage(ef5);
    }
     else if(frame == 5)
    {
        setImage(ef6);
    }
     else if(frame == 6)
    {
        setImage(ef7);
    }
    else if(frame == 7)
    {
        setImage(ef8);
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
    
    Actor ground = getOneObjectAtOffset(0, lookForGround, plt.class);
    
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
    Actor rightWall = getOneObjectAtOffset(xDistance, 0, plt.class);
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
    Actor leftWall = getOneObjectAtOffset(xDistance, 0, plt.class);
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
