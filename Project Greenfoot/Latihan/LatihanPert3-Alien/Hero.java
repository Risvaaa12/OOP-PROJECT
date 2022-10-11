import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveHero();
        shootLaser();
    }  
    
    public void moveHero()
    {
        if (Greenfoot.isKeyDown("W"))
            setLocation(getX(),getY()-3);
        if (Greenfoot.isKeyDown("S"))
            setLocation(getX(),getY()+3);
            
        if (Greenfoot.isKeyDown("A"))
            setLocation(getX()-3,getY());
        if (Greenfoot.isKeyDown("D"))
            setLocation(getX()+3,getY());
    }
    
    int laserTimer = 0;
    public void shootLaser()
    {
        /*if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Fire(), getX()+50,getY());
        }*/
        if(laserTimer==60){
            getWorld().addObject(new Fire(), getX()+50, getY());
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
}
