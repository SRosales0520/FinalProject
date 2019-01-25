import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    GreenfootImage stars = new GreenfootImage("starry background.jpg");
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Level1 currentLevel = (Level1)getWorld();
        
        
        if (currentLevel.getDeath() == true && currentLevel.getLivesLeft() == -1)
        {   
            stars.setColor( Color.WHITE );
            stars.setFont( stars.getFont().deriveFont(36f) );
            stars.drawString("you have lost  \n all of your lives", stars.getWidth()/2 - 75, stars.getHeight()/2 -50);
            stars.drawString("please try again!", stars.getWidth()/2 -130, stars.getHeight()/2 +75);
            setImage(stars);
            getImage().setTransparency(255);
            currentLevel.addObject( new Galaga_ship(), 300, 650 );
            currentLevel.removeObjects( currentLevel.getObjects(redMissile.class) );
            Greenfoot.setWorld(new Level1() );
            
        }
        else
        {
            getImage().setTransparency(0);
        }
        
        Greenfoot.delay(150);
        getWorld().removeObject(this);
        Greenfoot.stop();
    }   

}
