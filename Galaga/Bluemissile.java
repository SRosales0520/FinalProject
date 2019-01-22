import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bluemissile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bluemissile extends Actor
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
        
        destroyAliens();
        
        clearMissiles();
        
        noShipsLeft();
    }  
    
    public Bluemissile()
    {
        GreenfootImage image = getImage();
        image.scale(20, 20);  
        setImage(image); 
    }
    
    private void moveDown()
    {
        setLocation( getX(), getY() -3 );
    }
    
    public void destroyAliens()
    {
        if (isTouching())
        {
            getWorld().removeObject(getOneIntersectingObject(null));
            getWorld().removeObject(this);
            stillInWorld = false;
        }
    }
    
    public void clearMissiles()
    {
        if (stillInWorld == true && getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }
    public void noShipsLeft()
    {
        //if (getWorld().getObjects(Galaga_ship.class).size() == 0)
            //{            
                //getWorld().removeObject(this);
                
            //}
    }
    
    
}
