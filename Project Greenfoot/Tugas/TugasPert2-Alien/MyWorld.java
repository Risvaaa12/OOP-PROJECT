import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();       
    }
    
    public void act()
    {
        addEnemy();
    }
    public void addEnemy()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new Enemy(),600,Greenfoot.getRandomNumber(400));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,100,200);

        Enemy enemy = new Enemy();
        addObject(enemy,562,104);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,562,284);
    }
    
    
}

