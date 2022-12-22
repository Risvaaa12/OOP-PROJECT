import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (Risva) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    int turnspeed;
    public Block(int maxturnspeed){
        this.turnspeed = Greenfoot.getRandomNumber(maxturnspeed)-(maxturnspeed);
        if(turnspeed == 0){
            turnspeed = 1;
        }
    }
    public void act()
    {
        turn(turnspeed=2);
    }
}
