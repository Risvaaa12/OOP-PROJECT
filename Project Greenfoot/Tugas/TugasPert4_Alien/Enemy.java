import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy()
    {
        setRotation(180);
    }
    
    public Enemy(int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    
    private void removeEnemy()
    {
        if(isAtEdge())
        {
            // menghapus object dari world ketika sudah di ujung
            getWorld().removeObject(this); 
        }else if(isTouching(Hero.class)){
            setLocation(600,Greenfoot.getRandomNumber(400));
        }
    }
    
    private int speed = 2;
    public void act()
    {
        enemyMove();
    }
    
    protected void enemyMove(){
        move(speed);
        shootLaser();
        removeEnemy();
    }
  
    private int laserTimer = 0;
    private void shootLaser()
    {
        if(laserTimer==60){
            getWorld().addObject(new FireEnemy(), getX()-50, getY());
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
}
