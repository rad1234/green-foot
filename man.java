 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robo0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 2;
    private boolean jumping;
    private int jumpStrength = 20;
    private int speed = 5;
    
    private boolean ok = false;
    
    private int direction = 1;
    private int shootingCounter = 100;
    
   
    private GreenfootImage r0 = new GreenfootImage("r0.png");
    private GreenfootImage r1 = new GreenfootImage("r1.png");
    private GreenfootImage r2 = new GreenfootImage("r2.png");
    private GreenfootImage r3 = new GreenfootImage("r3.png");
    private GreenfootImage r4 = new GreenfootImage("r4.png");
    private GreenfootImage r5 = new GreenfootImage("r5.png");
    private GreenfootImage r6 = new GreenfootImage("r6.png");
    private GreenfootImage r7 = new GreenfootImage("r7.png");
    private GreenfootImage st0 = new GreenfootImage("st0.png");
    private GreenfootImage st1 = new GreenfootImage("st1.png");
    private GreenfootImage st2 = new GreenfootImage("st2.png");
    private GreenfootImage st3 = new GreenfootImage("st3.png");
    private GreenfootImage st4 = new GreenfootImage("st4.png");
    private GreenfootImage st5 = new GreenfootImage("st5.png");
    private GreenfootImage st6 = new GreenfootImage("st6.png");
    private GreenfootImage st7 = new GreenfootImage("st7.png");
    
    private GreenfootImage auchd = new GreenfootImage("auchd.png");
    private GreenfootImage auchst = new GreenfootImage("auchst.png");
    
    
    private int frame = 1;
    private int animeCounter = 0;
    
    private int imuneCounter = 0;
    
    private int veatsa = 5;
    private boolean atinge;
    private int timer = 50;
  
    private int inima = 150;
  
    public void act() 
    { 
        checkFall();
        verificaTasta();
        platformAbove();
        checkRightWalls();
        checkLeftWalls();
        shooting();
        hit();  
        shootingCounter--;
        imuneCounter--;
        animeCounter++;
        
    
    }
    public void moveRight()
    {
       setLocation(getX() + speed, getY()); 
       if(animeCounter % 8 == 0)
        {
        animateRight();   
        }
    }
     public void animateRight()
    {
        if(frame == 1)
        {
            setImage(r0);
        }
        else if(frame == 2)
        {
            setImage(r1);
        }
        else if(frame  == 3)
        {
            setImage(r2);
        }
        else if(frame  == 4)
        {
            setImage(r3);
        }
        else if(frame  == 5)
        {
            setImage(r4);
        }
        else if(frame  == 6)
        {
            setImage(r5);
        }
        else if(frame  == 7)
        {
            setImage(r6);
        }
        else if(frame  == 8)
        {
            setImage(r7);
            frame = 1;
            return;
        }
        frame++;
    }
    public void moveLeft()
    {
       setLocation(getX() - speed, getY());
       if(animeCounter % 8 == 0)
        {
        animateLeft();   
        }
    }
    public void animateLeft()
    {
        if(frame == 1)
        {
            setImage(st0);
        }
        else if(frame == 2)
        {
            setImage(st1);
        }
        else if(frame  == 3)
        {
            setImage(st2);
        }
        else if(frame  == 4)
        {
            setImage(st3);
        }
        else if(frame  == 5)
        {
            setImage(st4);
        }
        else if(frame  == 6)
        {
            setImage(st5);
        }
        else if(frame  == 7)
        {
            setImage(st6);
        }
        else if(frame  == 8)
        {
            setImage(st7);
            frame = 1;
            return;
        }
        frame++;
    }
    public void verificaTasta()
    {
        if(Greenfoot.isKeyDown("space") && jumping == false)
        {
            jump(); 
        }
        if(Greenfoot.isKeyDown("right"))
        {
            direction = 1;
            moveRight();
        }
        if(Greenfoot.isKeyDown("left"))
        {
            direction = -1;
            moveLeft();
        }
    }
    
    public boolean shooting()
    {
        if(Greenfoot.isKeyDown("x") && shootingCounter <= 0 && direction == 1)
        {
            getWorld().addObject(new ShootRight(), getX(), getY());
            shootingCounter = 100;
            return true;
        }
        else  if(Greenfoot.isKeyDown("x") && shootingCounter <= 0 && direction == -1)
        {
            getWorld().addObject(new ShootLeft(), getX(), getY());
            shootingCounter = 100;
            return true;
        }
        return false;
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
        jumping = true;
        return false;
    }
    else
    {
       moveToGround(ground);
      return true;
    }
}
public boolean platformAbove()
{ 
    int caracterHeight = getImage().getHeight();
    int lookForTavan = (int) (caracterHeight/-2 + 25);
    
    Actor tavan = getOneObjectAtOffset(0, lookForTavan, pltut.class);
    
    if(tavan != null)
    {
        vSpeed = 1;
        bopCap(tavan);
        return true;
    }
    else
    {
      return false;
    }
}
public boolean checkRightWalls()
{
    int caracterWidth = getImage().getWidth();
    int xDistance = (int)(caracterWidth/2 - 20);
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
    
}
public void bopCap(Actor tavan)
{
  int tavanHeigth = tavan.getImage().getHeight();
  int newY = tavan.getY() + (tavanHeigth + getImage().getHeight())/2;
  
  setLocation(getX(), newY);
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
   jumping = false;
}
public void jump()
{
  vSpeed = vSpeed - jumpStrength;
  jumping = true;
  fall();
}

public boolean hit()
{
    int caracterWidth = getImage().getWidth();
    int xDistance = (int)(caracterWidth/2 - 20);
    Actor Enemy = getOneObjectAtOffset(xDistance, 0, Enemy.class);
    if(Enemy == null)
    {   
        return false;
    }
    else
    {
        auch();
        return true;
    }
}
public void auch()
{
    if(imuneCounter <= 0 && direction == 1)
{
    this.setImage(auchd);
    vSpeed = vSpeed - jumpStrength;
    fall();
    imuneCounter = 100;
    noLaif noLaif5 = new noLaif();
    getWorld().addObject(noLaif5,inima,30); 
    inima -= 30;
}
 if(imuneCounter <= 0 && direction == -1)
{
    this.setImage(auchst);
    vSpeed = vSpeed - jumpStrength;
    fall();
    imuneCounter = 100;
    noLaif noLaif5 = new noLaif();
    getWorld().addObject(noLaif5,inima,30); 
    inima -= 30;
}


}
}

 
