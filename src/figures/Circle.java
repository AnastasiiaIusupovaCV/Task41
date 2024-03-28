package figures;
import java.awt.Color;

/**
 * Class represents circle and draws it given reference to a java.awt.Graphics object
 * @author a.yusupova
 */
public class Circle extends ScalableFigure{
    
    /**
     * Radius of the circle
     */
    protected int radius;

    /**
     * Constructor
     * @param r circle radius
     * @param g java.awt.Graphics object to draw the circle on
     */
    public Circle(int r, java.awt.Graphics g){
        this.radius = r;
        this.graphics = g;
    }

    /**
     * 
     * Sets the radius of the circle
     * @param r circle radius in pixels
     */
    public void setRadius(int r){this.radius = r;}


    /**
     * Returns the radius of the circle
     * @return current radius of the circle in pixels
     */
    public int radius(){return this.radius;}
    
    /**
     *  Returns type name of the current figure
     * @return String with the name of the figure type
     */
    @Override
    public String typeName() {
        return "Circle";
    }
    
    /**
     * Draws the figure on the Graphics object provided in constructor
     */
    @Override
    public void show(){
        Color oldC=graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.drawOval(position.x, position.y, 
                (int)( this.radius * this.size), (int)( this.radius * this.size));
        graphics.setColor(oldC);
    }
    
    /**
     * Removes the figure from the Graphics object provided in constructor
     * Note that an appropriate background color must be set in order to draw 
     * over the existing figure!
     */
    @Override
    public void hide(){
        Color oldC=graphics.getColor();
        graphics.setColor(bgColor);
        graphics.drawOval(position.x, position.y, 
                          (int)( this.radius * this.size), (int)( this.radius * this.size));
        graphics.setColor(oldC);
    }
    
}
