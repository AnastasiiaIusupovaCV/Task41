package figures;

import figures.Figure;
import java.awt.Color;

/**
 * Class represents dot and draws it given reference to a java.awt.Graphics object
 * @author a.yusupova
 */
public class Dot extends Figure{

    /**
     * Constructor
     * @param g java.awt.Graphics object to draw the dot on
     */
    public Dot(java.awt.Graphics g)
    {
        this.graphics = g;
    }
    
    /**
     *  
     * @return String with the name of the figure type
     */
    @Override
    public String typeName() {
        return "Dot";
    }
    
    /**
     * 
     * Draws the figure on the Graphics object provided in constructor
     */
    @Override
    public void show(){
        Color oldC=graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.fillOval(position.x, position.y, 
                          2, 2);
        graphics.setColor(oldC);
    }
    
    /**
     * 
     * Removes the figure from the Graphics object provided in constructor
     * Note that an appropriate background color must be set in order to draw 
     * over the existing figure!
     */
    @Override
    public void hide(){
        Color oldC=graphics.getColor();
        graphics.setColor(bgColor);
        graphics.fillOval(position.x, position.y, 
                          2, 2);
        graphics.setColor(oldC);
    }

}
