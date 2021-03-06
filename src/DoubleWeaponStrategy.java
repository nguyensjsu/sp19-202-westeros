import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleWeaponStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleWeaponStrategy implements IShootingStrategy 
{
    
    private int timebetweenshots = 5;
    
    /**
     * Constructor for objects of class DouxbleWeaponStrategy
     */
    public DoubleWeaponStrategy()
    {
    }

    /**
     * shoot method
     * world: world
     * currentWeaponFactory: current Weapon Factory
     * Xcoord: x coordinate
     * Ycoord: y coordinate
     */
    public void shoot(World world,WeaponFactory currentWeaponFactory,int Xcoord, int Ycoord)
    {
        //PlayerBullet playerbullet = new PlayerBullet();
       if(world != null)
            world.addObject(currentWeaponFactory.getWeapon(), Xcoord, Ycoord);
       for(timebetweenshots = 5; timebetweenshots <= 1000; timebetweenshots++)
        {}
       world.addObject(currentWeaponFactory.getWeapon(), Xcoord, Ycoord);
       timebetweenshots = 5;
    }
}
