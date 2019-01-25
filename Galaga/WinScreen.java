import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends Actor
{
    GreenfootImage stars = new GreenfootImage("starry background.jpg");
    /**
     * Act - do whatever the WinScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World currentLevel = getWorld();
        
        if (currentLevel instanceof Level1)
        {
            if (getWorld().getObjects(Alien.class).size() == 0 && ((Level1)currentLevel).getLivesLeft() > -1)
            {   
                stars.setColor( Color.WHITE );
                stars.setFont( stars.getFont().deriveFont(36f) );
                stars.drawString("you have defeated \n the aliens!", stars.getWidth()/2 - 100, stars.getHeight()/2 -50);
                stars.drawString("on to \n the next leveL!", stars.getWidth()/2 -110, stars.getHeight()/2 +75);
                setImage(stars);
                getImage().setTransparency(255);
                currentLevel.addObject( new Galaga_ship(), 300, 650 );
                currentLevel.removeObjects( currentLevel.getObjects(redMissile.class) );
                Greenfoot.delay(150);
                ((Level1)currentLevel).changeWorld(); 
            }
            else
            {
                getImage().setTransparency(0);
            }
        }
        if (currentLevel instanceof Level2)
        {
            if (getWorld().getObjects(Alien.class).size() == 0 && ((Level2)currentLevel).getLivesLeft() > -1)
            {   
                stars.setColor( Color.WHITE );
                stars.setFont( stars.getFont().deriveFont(36f) );
                stars.drawString("you have defeated \n the aliens!", stars.getWidth()/2 - 100, stars.getHeight()/2 -50);
                stars.drawString("on to \n the next leveL!", stars.getWidth()/2 -110, stars.getHeight()/2 +75);
                setImage(stars);
                getImage().setTransparency(255);
                currentLevel.addObject( new Galaga_ship(), 300, 650 );
                currentLevel.removeObjects( currentLevel.getObjects(redMissile.class) );
                Greenfoot.delay(150);
                ((Level2)currentLevel).changeWorld(); 
            }
            else
            {
                getImage().setTransparency(0);
            }
        }
        Greenfoot.delay(150);
        getWorld().removeObject(this);
    }   

}
