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
    
    int spawnTime = 0; //deklarasi spawnTime
    public void act()
    {
        /*spawnTime = (spawnTime+1)%300; // berulang setiap 5 detik
        if(spawnTime == 0) // akan berulang setiap reset
        {
            int speed = Greenfoot.getRandomNumber(4)+1;
            addEnemy(); // tambah enemy baru
        }*/
        if (spawnTime==180){ //timer 3 detik ==> 60fps x 3s
            addEnemy(); //menambah enemy baru
            spawnTime=0; //reset timer
        }else{
            spawnTime++; //akan terus bertambah sebelum 180
        }
        
    }
    public void addEnemy()
    {
        //menambah enemy baru di  x = 600, dan y = random dengan batas 400
        int speed = Greenfoot.getRandomNumber(5)+1;
        addObject(new Enemy(),600,Greenfoot.getRandomNumber(400)); 
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // menambah actor hero
        Hero hero = new Hero();
        addObject(hero,100,200);
    }
    
    
}

