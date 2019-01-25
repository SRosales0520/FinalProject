import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yellow_alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yellow_alien extends Alien
{
    
    /**
     * Act - do whatever the Yellow_alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX() + 1*speed, getY() );
        if (getX() >= getWorld().getWidth() - 1 || getX() <= 0)
        {
            speed = speed * -1;
        }
        shootMissile();
    } 
    
    public Yellow_alien()
    {
        GreenfootImage image = getImage();
        image.scale(40, 40);  
        setImage(image); 
    }
    public void shootMissile()
    {
        if(Greenfoot.getRandomNumber(500) == 1)
        {
            getWorld().addObject( new redMissile(), getX(), getY() + 45);
        }
    }
    
}
