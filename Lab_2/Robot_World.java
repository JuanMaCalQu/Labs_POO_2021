import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot_World here.
 * 
 * @author (Daniela Ramírez, Adriana Velasquez, Juan Manuel Calderon) 
 * @version (4/02/2021)
 */
public class Robot_World extends World
{

    /**
     * Constructor for objects of class Robot_World.
     * 
     */
    public Robot_World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare_scenario();
    }
    /** Add objects in the principal scene */
    public void prepare_scenario(){
        addObject(new Robot(),48,50);
        addObject(new Wall(),52,147);
        addObject(new Wall(),159,147);
        addObject(new Wall(),266,147);
        addObject(new Wall(),587,147);
        addObject(new Wall(),692,147);
        addObject(new Wall(),791,147);
        addObject(new Block(),427,145);
        addObject(new Home(),751,552);
        addObject(new Score_Panel(),71,554);
        addObject(new Apple(),720,46);
        addObject(new Apple(),433,38);
        addObject(new Apple(),183,302);
        addObject(new Apple(),682,312);
        addObject(new Apple(),417,537);
    }
}
