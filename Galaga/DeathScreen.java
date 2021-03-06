import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathScreen extends Actor
{
    GreenfootImage stars = new GreenfootImage("starry background.jpg");
    /**
     * Act - do whatever the DeathScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World currentLevel = getWorld();
        if( currentLevel instanceof Level1 )
        {
            if ( ((Level1)currentLevel).getDeath() == true && currentLevel.getObjects(Galaga_ship.class).size() == 0 && ((Level1)currentLevel).getLivesLeft() > -1)
            {   
                stars.setColor( Color.WHITE );
                stars.setFont( stars.getFont().deriveFont(36f) );
                stars.drawString("you died!", stars.getWidth()/2 - 60, stars.getHeight()/2);
                stars.drawString("your actions have caused \n     you to lose one life", stars.getWidth()/2 -170, stars.getHeight()/2 +75);
                setImage(stars);
                getImage().setTransparency(255);
                currentLevel.addObject( new Galaga_ship(), 300, 650 );
                currentLevel.removeObjects( currentLevel.getObjects(redMissile.class) );
            }
            else
            {
                getImage().setTransparency(0);
            }
            
        }
        else if( currentLevel instanceof Level2 )
        {
            if ( ((Level2)currentLevel).getDeath() == true && currentLevel.getObjects(Galaga_ship.class).size() == 0 && ((Level2)currentLevel).getLivesLeft() > -1)
            {   
                stars.setColor( Color.WHITE );
                stars.setFont( stars.getFont().deriveFont(36f) );
                stars.drawString("you died!", stars.getWidth()/2 - 60, stars.getHeight()/2);
                stars.drawString("your actions have caused \n     you to lose one life", stars.getWidth()/2 -170, stars.getHeight()/2 +75);
                setImage(stars);
                getImage().setTransparency(255);
                currentLevel.addObject( new Galaga_ship(), 300, 650 );
                currentLevel.removeObjects( currentLevel.getObjects(redMissile.class) );
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
