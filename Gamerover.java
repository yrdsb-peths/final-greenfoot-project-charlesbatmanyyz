import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gamerover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gamerover extends World
{

    /**
     * Constructor for objects of class Gamerover.
     * 
     */
    public Gamerover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label label1 = new Label("Gameover", 50);
        addObject(label1, 100, 100);
    }
}
