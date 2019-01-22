import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    GreenfootImage logo = new GreenfootImage ("space defenders logo.png");
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("starry background.jpg");
        TextBox textbox = new TextBox("Click here to start", 24, true, Color.BLACK, Color.RED);
        
        
        addObject( textbox, 300, 200);
        
        getBackground().drawImage(logo, 50, 25);
        
        showText("destroy all the aliens and save earth by using \n WASD to move and the space bar to shoot missiles.", 300, 300);
    }
    
}
