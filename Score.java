import greenfoot.*;
import java.awt.Color;


public class Score extends Actor
{
    int score = 0; // the score field
    
    
    public Score()
    {
        updateImage();
    }
    
  
    private void updateImage()
    {
        setImage(new GreenfootImage("Points: "+score, 30, Color.white, new Color(0, 0, 0, 0)));
    }
    
   
    public void add(int addAmt)
    {
        if(score == 3)
        { 
            vic w = new vic();
            Greenfoot.setWorld(w);
        }
        else
       { score+=addAmt;
        updateImage();
    }
    }
}