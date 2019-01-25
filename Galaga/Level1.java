import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: samuel rosales 
 * Course: software development
 * Teacher: Mr. Hardman 
 * Date Last Modified: january 24th 2019
 */
/**
 * Level1 is the starting world for my space defenders game
 * 
 * @author (Samuel) 
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
     * default constructor for Level1 sets the background to the stars image, adds in the ship, banner and lifecounters. 
     * this constuctor also sets the paint order of the game to GameOver.class and DeathScreen.class, and calls the setDeathmethod .
     * 
     * @param there are none
     * @return an object of World
     */
    public Level1()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        
        setBackground("starry background.jpg");
        
        showText("Level 1", 40, 10);
        
        int x = 300;
        int y = 650;
        addObject( new Galaga_ship(), x, y);
        
        addObject( new lvl1banner(), 575, 675);
 
        greenAlienImages = new GreenfootImage[] {new GreenfootImage("New Piskel (4).png"), new GreenfootImage("New Piskel (wing movement 2).png"), new GreenfootImage("New Piskel ( wing movement 3).png")}; 
        
        addAliens();
        
        addObject( new Lifecountership(), 15, 550);
        addObject( new Lifecountership(), 15, 575);
        addObject( new Lifecountership(), 15, 600);
       
        
        setPaintOrder(GameOver.class, DeathScreen.class);
        
        setDeath();
        
    }
    /**
     * act method runs when the act button is pressed and constantly runs the win method but nothing happens until win methods requirements are met. 
     * 
     * @param there are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        win();
    }
    /**
     * addAliens has multiple loops that go through and add the aliens at multiple incemented places along the screen 
     * 
     * @param there are no parameters
     * @return Nothing is returned
     */
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
    /**
     * getDeath returns the shipDeath boolean for use in telling the game that you have died. 
     * 
     * @param there are no parameters
     * @return a Boolean called shipDeath
     */
    public boolean getDeath()
    {
        return shipDeath;
    }
    /**
     * setDeath checks to see how many lives you have left and either shows the death scrren or the GameOver screen. 
     * 
     * @param there are no parameters
     * @return Nothing is returned
     */
    public void setDeath()
    {
        if(livesLeft > -1)
        {
            shipDeath = true;
            addObject(new DeathScreen(), getWidth()/2, getHeight()/2);
        }
        else if(livesLeft == -1)
        {
            shipDeath = true;
            addObject(new GameOver(), getWidth()/2, getHeight()/2);
        }
        
    }
    /**
     * changeWorld will set the world to a new level2 world if called. 
     * 
     * @param there are no parameters
     * @return Nothing is returned
     */
    public void changeWorld()
    {
        Greenfoot.setWorld( new Level2() );
    }
    /**
     * getGreenAlienImages returns the image at the given index through the parameter. 
     * 
     * @param int index. used to acces different indecies of the array
     * @return a GreenfootImage is returned.
     */
    public GreenfootImage getGreenAlienImages(int index)
    {
        return greenAlienImages[index];
    }
    
    public void removeLife()
    {
        livesLeft = livesLeft -1;
        
        if (livesLeft == 2)
        {
            removeObject( getObjects(Lifecountership.class).get(livesLeft) );
        } 
        else if (livesLeft == 1)
        {
            removeObject( getObjects(Lifecountership.class).get(livesLeft) );
        }
        else if (livesLeft == 0)
        {
            removeObject( getObjects(Lifecountership.class).get(livesLeft) );
        }
    }
    public int getLivesLeft()
    {
        return livesLeft;
    }
    public void win()
    {
        if (getObjects(Alien.class).size() == 0)
        {
            addObject( new WinScreen(), getWidth()/2, getHeight()/2);
        }
    }
}
