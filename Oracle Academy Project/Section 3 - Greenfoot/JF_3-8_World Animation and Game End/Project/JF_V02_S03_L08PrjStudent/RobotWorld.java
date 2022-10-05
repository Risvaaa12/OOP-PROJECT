import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Risva) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Robot placement
        Robot robot = new Robot();
        addObject(robot,48,50);
        //block placement
        Block block = new Block();
        addObject(block,427,145);

        //add wall
        Wall wall1 = new Wall();
        addObject(wall1,52,147);
        Wall wall2 = new Wall();
        addObject(wall2,159,147);
        Wall wall3 = new Wall();
        addObject(wall3,266,147);
        Wall wall4 = new Wall();
        addObject(wall4,587,147);
        Wall wall5 = new Wall();
        addObject(wall5,692,147);
        Wall wall6 = new Wall();
        addObject(wall6,791,147);

        //add home
        Home home = new Home();
        addObject(home, 751,552);

        //add scorePanel
        ScorePanel scorePanel = new ScorePanel();
        addObject(scorePanel,71,554);

        //add 5 pizza
        Pizza pizza1 = new Pizza();
        addObject(pizza1,720,46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,433,38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,183,302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,682,312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,417,537);
        
    }
    
    private void call()
    {
        //Method call
    }
}
