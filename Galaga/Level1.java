import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private boolean shipDeath = false;
    
    private GreenfootImage[] greenAlienImages = new GreenfootImage[3];
    private GreenfootImage[] purpleAlienImages = new GreenfootImage[3];
    private GreenfootImage[] yellowAlienImages = new GreenfootImage[3];
    
    private int livesLeft = 3;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        
        setBackground("starry background.jpg");
        
        int x = 300;
        int y = 650;
        addObject( new Galaga_ship(), x, y);
        
        addObject( new lvl1banner(), 575, 675);
 
        greenAlienImages = new GreenfootImage[] {new GreenfootImage("New Piskel (4).png"), new GreenfootImage("New Piskel (wing movement 2).png"), new GreenfootImage("New Piskel ( wing movement 3).png")}; 
        
        addAliens();
        
        if (livesLeft == 3)
        {
            addObject( new Lifecountership(), 15, 550);
            addObject( new Lifecountership(), 15, 575);
            addObject( new Lifecountership(), 15, 600);
        }
        
        setPaintOrder(DeathScreen.class);
        
        
    }
    
    public void addAliens()
    {
        //draws the yellow ships
        for(int a = 245; a <= 350; a+=35)
        {
            addObject( new Yellow_alien(), a, 100);
        }
        //draws the red ships
        for(int b = 200; b <= 400; b+=40)
        {
            addObject( new Red_alien(), b, 130);
        }
        //draws the purple ships
        for(int c = 160; c <= 440; c+=40)
        {
            addObject( new Purple_alien(), c, 165);
        }
        //draws the green ships
        for(int d = 120; d <= 500; d+=60)
        {
            for(int e = 200; e <= 270; e+=35)
            {
                addObject( new GreenAlien(this), d, e);
            }
        }  
    }
    
    public boolean getDeath()
    {
        return shipDeath;
    }

    public void setDeath()
    {
        shipDeath = true;
        addObject(new DeathScreen(), getWidth()/2, getHeight()/2);
    }
    
    public void changeWorld()
    {
        Greenfoot.setWorld( new Level2() );
    }
    
    public GreenfootImage getGreenAlienImages(int index)
    {
        return greenAlienImages[index];
    }
    
}
