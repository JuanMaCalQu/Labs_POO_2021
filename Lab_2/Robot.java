import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
   
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatApple();
    } 
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("right")){
            int x,y;
            x = (getX()+2);
            y = getY();
            setLocation(x,y);
        }
        if (Greenfoot.isKeyDown("left")){
            int x,y;
            x = (getX()-2);
            y = getY();
            setLocation(x,y);
        }
        if (Greenfoot.isKeyDown("up")){
            int x,y;
            x = getX();
            y = (getY()-2);
            setLocation(x,y);
        }
        if (Greenfoot.isKeyDown("down")){
            int x,y;
            x = getX();
            y = (getY()+2);
            setLocation(x,y);
        }
    }    
    public void detectWallCollision()
    {
        if (isTouching(Wall.class)){
            setLocation(48, 50);
            Greenfoot.playSound("hurt.mp3");
        }
    }  
    public void detectBlockCollision()
    {
        if (isTouching(Block.class)){
            setLocation(48, 50);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    public void detectHome(){
        if (isTouching(Home.class)){
            setLocation(48, 50);
            Greenfoot.playSound("yipee.mp3");
        }
    }
    public void eatApple(){
        if (isTouching(Apple.class)){
            removeTouching(Apple.class);
            Greenfoot.playSound("eat.mp3");
        }
    }
}
