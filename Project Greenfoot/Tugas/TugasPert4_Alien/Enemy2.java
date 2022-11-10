import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    int range;
    public void act(){       
        range += 1;
        if(range ==50){
            turn(15);
        }else if (range ==100){
            turn(-50);
        }else if (range ==150){
            turn(35);
        }else if (range ==200){
            turn(65);
        }else if (range ==250){
            turn(-50);
            range=0;
        }
        
        super.enemyMove(); //memanggil method act di super-class
    }
}
