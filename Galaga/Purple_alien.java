import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Purple_alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Purple_alien extends Alien
{
    
    private boolean movePurpleWings2 = true;
    private boolean movePurpleWings3 = true;
    
  
    private GreenfootImage image2 = new GreenfootImage("New Piskel (purple 2).png");
    private GreenfootImage image3 = new GreenfootImage("New Piskel (3).png");
    /**
     * Act - do whatever the Purple_alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation( getX() + speed, getY() );
        
        shootMissile();
        if (getX() >= getWorld().getWidth() -2 || getX() <= 0)
        {
            speed = speed * -1;
            setLocation( getX() + speed, getY() );
            setLocation( getX() + speed, getY() );
        }
        

        
        if (movePurpleWings2 == true)
        {
            setImage(image2);
            movePurpleWings2 = false;
            movePurpleWings3 = true;
            

        }
        
        else if (movePurpleWings3 == true)
        {
            setImage(image3);
            movePurpleWings2 = true;
            movePurpleWings3 = false; 

 
        }
    }
    
    public Purple_alien()
    {
        speed = 1;
        
        image2.scale(35, 35);
        image3.scale(35, 35); 
        setImage(image3);
    }
    public void shootMissile()
    {
        if(Greenfoot.getRandomNumber(800) == 1)
        {
            getWorld().addObject( new redMissile(), getX(), getY() + 45);
        }
    }
}
