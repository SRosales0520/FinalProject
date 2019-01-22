import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green_alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenAlien extends Alien
{
    private boolean moveGreenWings1 = true;
    private boolean moveGreenWings2 = true;
    private boolean moveGreenWings3 = true;
    
    private GreenfootImage image1 = new GreenfootImage("New Piskel (4).png");
    private GreenfootImage image2 = new GreenfootImage("New Piskel (wing movement 2).png");
    private GreenfootImage image3 = new GreenfootImage("New Piskel ( wing movement 3).png");
    
    private int levelNumber = 0;
    
    public GreenAlien(World w)
    {
        if( w instanceof Level1 )
        {
            ((Level1) w).getGreenAlienImages(0).scale(35, 35);
            ((Level1) w).getGreenAlienImages(1).scale(35, 35);
            ((Level1) w).getGreenAlienImages(2).scale(35, 35);
            
            setImage( ( (Level1) w).getGreenAlienImages(0) );
            
            levelNumber = 1;
        }
        
        speed = 1;
        
    }
    
    /**
     * Act - do whatever the Green_alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Add your action code here.
        setLocation( getX() + speed, getY() );
        
        shootMissile();
        if (getX() >= getWorld().getWidth() - 2 || getX() <= 0)
        {
            speed = speed * -1;
            setLocation( getX() + speed, getY() );
            setLocation( getX() + speed, getY() );
        }
        
        
        if (moveGreenWings1 == true)
        {
            if( levelNumber == 1 )
            {
                setImage( ( (Level1)getWorld() ).getGreenAlienImages(0));
            }
            
            moveGreenWings1 = false;
            moveGreenWings2 = true;
            moveGreenWings3 = false;
            image1.scale(35, 35);
            
        }
        
        else if (moveGreenWings2 == true)
        {
            if( levelNumber == 1 )
            {
                setImage( ( (Level1)getWorld() ).getGreenAlienImages(1));
            }
            moveGreenWings1 = false;
            moveGreenWings2 = false;
            moveGreenWings3 = true;
            

        }
        
        else if (moveGreenWings3 == true)
        {
            if( levelNumber == 1 )
            {
                setImage( ( (Level1)getWorld() ).getGreenAlienImages(2));
            }
            moveGreenWings1 = true;
            moveGreenWings2 = false;
            moveGreenWings3 = false; 

 
        }
        
        
    }  
    public void shootMissile()
    {
        if(Greenfoot.getRandomNumber(600) == 1)
        {
            getWorld().addObject( new redMissile(), getX(), getY() + 45);
        }
    }
    
}
