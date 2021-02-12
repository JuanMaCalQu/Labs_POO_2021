import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot.
 * 
 * Class to make character in the world and establish the movement in his
 * 
 * @author (Daniela Ramirez, Adriana Velasquez, Juan M Calderon) 
 * @version (11/FEB/2021)
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
    /** Make the movement whit keys right,left,up and down */
   
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
    /** Establish the collision in the robot */
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
    /** Make robot detect home */
    public void detectHome(){
        if (isTouching(Home.class)){
            setLocation(48, 50);
            Greenfoot.playSound("yipee.mp3");
        }
    }
    /** Method robot eat a apple */
    public void eatApple(){
        if (isTouching(Apple.class)){
            removeTouching(Apple.class);
            Greenfoot.playSound("eat.mp3");
        }
    }
}
