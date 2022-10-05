import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        
    }
    public void robotMovement()
    {
        //menambah keyboard untuk robot
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-5);
            animate();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
            animate();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
            animate();
        }
    }
    public void detectWallCollision()
    {
        // ketika menabrak wall akan kembali ke tempat awal dan ada sound
        if (isTouching(Wall.class))
        {
            setLocation(45,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectBlockCollision()
    {
        // ketika menabrak block akan kembali ke tempat awal dan ada sound
        if (isTouching(Block.class))
        {
            setLocation(45,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectHome()
    {
        //ketika menabrak Home kembali ke start dan ada sound
        if (isTouching(Home.class))
        {
            setLocation(45,50);
            Greenfoot.playSound("yipee.wav");
        }
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
        }
    }
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    public Robot()
    {
        robotimage1=new GreenfootImage("man01.png");
        robotimage2=new GreenfootImage("man02.png");
    }
    public void animate()
    {
        
        if(getImage()==robotimage1){
            setImage(robotimage2);
        }else{
            setImage(robotimage1);
        }
        
    }
    
}
