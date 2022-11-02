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
        addEnemy(); //menambah enemy baru
        addEnemy2();
    }
    
    private void addEnemy()
    {
        if (spawnTime==180){ //timer 3 detik ==> 60fps x 3s
            int speed = Greenfoot.getRandomNumber(4)+1;
            addObject(new Enemy(),600,Greenfoot.getRandomNumber(400)); 
            spawnTime=0;
        }else{
            spawnTime++; //akan terus bertambah sebelum 180
        }
    }
    
    
    private void addEnemy2()
    {
        if (spawnTime==180){ //timer 3 detik ==> 60fps x 3s
            int speed = Greenfoot.getRandomNumber(4)+1;
            addObject(new Enemy2(),600,Greenfoot.getRandomNumber(400)); 
            spawnTime=0;
        }else{
            spawnTime++; //akan terus bertambah sebelum 180
        }
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
        //Greenfoot.playSound("minion_theme_01.mp3");
    }
    
    
}

