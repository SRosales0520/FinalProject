import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Red_alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red_alien extends Alien
{
    private boolean moveRedWings1 = true;
    private boolean moveRedWings2 = true;
    private boolean moveRedWings3 = true;
    
    private GreenfootImage image1 = new GreenfootImage("New Piskel (2).png");
    private GreenfootImage image2 = new GreenfootImage("New Piskel (red 3).png");
    private GreenfootImage image3 = new GreenfootImage("New Piskel (red 2 ).png");
    /**
     * Act - do whatever the Red_alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation( getX() + 1*speed, getY() );
        if (getX() >= getWorld().getWidth() - 2 || getX() <= 0)
        {
            speed = speed * -1;
            setLocation( getX() + speed, getY() );
            setLocation( getX() + speed, getY() );
        }
        
        if (moveRedWings1 == true)
        {
            setImage(image1);
            moveRedWings1 = false;
            moveRedWings2 = true;
            moveRedWings3 = false;
            image1.scale(35, 35);
            
        }
        
        else if (moveRedWings2 == true)
        {
            setImage(image2);
            moveRedWings1 = false;
            moveRedWings2 = false;
            moveRedWings3 = true;
            

        }
        
        else if (moveRedWings3 == true)
        {
            setImage(image3);
            moveRedWings1 = true;
            moveRedWings2 = false;
            moveRedWings3 = false; 

 
        }
    } 
    
    public Red_alien()
    {
        speed = 1;
        
        image1.scale(35, 35); 
        image2.scale(35, 35);
        image3.scale(35, 35); 
        setImage(image1);
    }
}
