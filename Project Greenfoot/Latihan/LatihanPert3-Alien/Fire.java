import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fireShoot();
        removeFromWorld();
    }
    
    public void fireShoot()
    {
        setLocation(getX()+3, getY());
    }
    
    public void removeFromWorld()
    {
        /*Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null)
        {
             getWorld().removeObject(enemy);
             getWorld().removeObject(this);
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }*/
        
        if (isTouching(Enemy.class)){
            getWorld().addObject(new Boom(), getX(), getY());
            
            removeTouching(Enemy.class);
            
            getWorld().removeObject(this);       
        }else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
