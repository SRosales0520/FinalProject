import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class redMissile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class redMissile extends Actor
{
    private boolean stillInWorld = true;
    
    /**
     * Act - do whatever the Bluemissile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveDown();
        
        destroyShip();
        
        clearMissiles();
        
        
    }  
    
    public redMissile()
    {
        GreenfootImage image = getImage();
        image.scale(20, 20);  
        setImage(image); 
    }
    
    private void moveDown()
    {
        setLocation( getX(), getY() +3 );
    }
    
    public void destroyShip()
    {
        GreenfootImage stars = new GreenfootImage("starry background.jpg");
        List blueMissles = getWorld().getObjects(Bluemissile.class);
        Level1 currentLevel = (Level1) getWorld();
        if (isTouching(Galaga_ship.class))
        {
            removeTouching(Galaga_ship.class);
            getWorld().removeObjects(blueMissles);
            stillInWorld = false;
            currentLevel.removeLife();
            currentLevel.setDeath();
            getWorld().removeObject(this);
        }
    }
    
    public void clearMissiles()
    {
        if (stillInWorld == true && getY() >= 680)
        {
            getWorld().removeObject(this);
        }
    }
}
