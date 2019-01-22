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
        Level1 currentLevel = (Level1)getWorld();
        
        
        if (currentLevel.getDeath() == true)
        {   
            stars.setColor( Color.WHITE );
            stars.setFont( stars.getFont().deriveFont(36f) );
            stars.drawString("you died!", stars.getWidth()/2 - 60, stars.getHeight()/2);
            stars.drawString("your actions have caused \n     you to lose one life", stars.getWidth()/2 -170, stars.getHeight()/2 +75);
            setImage(stars);
            getImage().setTransparency(255);
            currentLevel.removeLife();
            currentLevel.addObject( new Galaga_ship(), 300, 650 );
            currentLevel.removeObjects( currentLevel.getObjects(redMissile.class) );
            System.out.println(currentLevel.getLivesLeft());
        }
        else
        {
            getImage().setTransparency(0);
        }
        
        Greenfoot.delay(150);
        getWorld().removeObject(this);
    }   

}
