import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Galaga_ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galaga_ship extends Actor
{
    private boolean shipDeath1 = false;
    private boolean spaceDown = false;
    private int shotDelay = 30;
    public boolean hasHitGreenalien = false;
    /**
     * Act - do whatever the Galaga_ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        // Add your action code here.
        checkKeyPresses();
        
        shotDelay++;
        
        
    }  
    
    public Galaga_ship()
    {
      GreenfootImage image = getImage();
      image.scale(35, 35);  
      setImage(image);
    }
    

    public void checkKeyPresses()
    {
        if (Greenfoot.isKeyDown("a") == true)
        {
            move(-3);
        }
        
        if (Greenfoot.isKeyDown("d") == true)
        {
            move(3);
        }
        
        if (Greenfoot.isKeyDown("w") == true)
        {
            setLocation(getX(), getY() -3);
        }
        
        if (Greenfoot.isKeyDown("s") == true)
        {
            setLocation(getX(), getY() +3);
        }
        
        if (spaceDown == false && Greenfoot.isKeyDown("Space") == true && shotDelay >= 40)
        {
            getWorld().addObject( new Bluemissile(), getX(), getY() - 45);
            spaceDown = true;
            shotDelay = 0;
        }
        
        if (Greenfoot.isKeyDown("space") == false)
        {
            spaceDown = false;
        }
        

    }
    
    
    

}
