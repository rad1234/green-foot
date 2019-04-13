 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robo0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robo0 extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 2;
    private boolean jumping;
    private int jumpStrength = 20;
    private int speed = 5;
    
    private boolean ok = false;
    
    private int direction = 1;
    private int shootingCounter = 100;
    
    private GreenfootImage f1 = new GreenfootImage("f1.png");
    private GreenfootImage f2 = new GreenfootImage("f2.png");
    private GreenfootImage f3 = new GreenfootImage("f3.png");
    private GreenfootImage f4 = new GreenfootImage("f4.png");
    private GreenfootImage f5 = new GreenfootImage("f5.png");
    private GreenfootImage f6 = new GreenfootImage("f6.png");
    private GreenfootImage f7 = new GreenfootImage("f7.png");
    private GreenfootImage f8 = new GreenfootImage("f8.png");
    private GreenfootImage s1 = new GreenfootImage("s1.png");
    private GreenfootImage s2 = new GreenfootImage("s2.png");
    private GreenfootImage s3 = new GreenfootImage("s3.png");
    private GreenfootImage s4 = new GreenfootImage("s4.png");
    private GreenfootImage s5 = new GreenfootImage("s5.png");
    private GreenfootImage s6 = new GreenfootImage("s6.png");
    private GreenfootImage s7 = new GreenfootImage("s7.png");
    private GreenfootImage s8 = new GreenfootImage("s8.png");
    
    private GreenfootImage auchs = new GreenfootImage("auchs.png");
    private GreenfootImage auchf = new GreenfootImage("auchf.png");
    
    private GreenfootImage x = new GreenfootImage("nolife.png");
    
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
            setImage(f1);
        }
        else if(frame == 2)
        {
            setImage(f2);
        }
        else if(frame  == 3)
        {
            setImage(f3);
        }
        else if(frame  == 4)
        {
            setImage(f4);
        }
        else if(frame  == 5)
        {
            setImage(f5);
        }
        else if(frame  == 6)
        {
            setImage(f6);
        }
        else if(frame  == 7)
        {
            setImage(f7);
        }
        else if(frame  == 8)
        {
            setImage(f8);
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
            setImage(s1);
        }
        else if(frame == 2)
        {
            setImage(s2);
        }
        else if(frame  == 3)
        {
            setImage(s3);
        }
        else if(frame  == 4)
        {
            setImage(s4);
        }
        else if(frame  == 5)
        {
            setImage(s5);
        }
        else if(frame  == 6)
        {
            setImage(s6);
        }
        else if(frame  == 7)
        {
            setImage(s7);
        }
        else if(frame  == 8)
        {
            setImage(s8);
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
    
    Actor ground = getOneObjectAtOffset(0, lookForGround, plt.class);
    
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
    
    Actor tavan = getOneObjectAtOffset(0, lookForTavan, plt.class);
    
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
    this.setImage(auchf);
    vSpeed = vSpeed - jumpStrength;
    fall();
    imuneCounter = 100;
    noLaif noLaif5 = new noLaif();
    getWorld().addObject(noLaif5,inima,30); 
    inima -= 30;
}
 if(imuneCounter <= 0 && direction == -1)
{
    this.setImage(auchs);
    vSpeed = vSpeed - jumpStrength;
    fall();
    imuneCounter = 100;
    noLaif noLaif5 = new noLaif();
    getWorld().addObject(noLaif5,inima,30); 
    inima -= 30;
}
else if(inima == 0)
{
    def w = new def();
Greenfoot.setWorld(w);
}

}
}

 
