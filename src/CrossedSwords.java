import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrossedSwords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrossedSwords extends Actor
{
    /**
     * Act - do whatever the CrossedSwords wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    /**
     * Constructor
     */
    public CrossedSwords()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 550 , img.getHeight() - 550);
    }
}
