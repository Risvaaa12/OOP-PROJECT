import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireEnemy extends Actor
{
    /**
     * Act - do whatever the FireEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 5;
    public void act()
    {
        move(speed);
        setRotation(180);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }

}