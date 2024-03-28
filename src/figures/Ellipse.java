package figures;

import java.awt.Color;

/**
 * Class represents ellipse and draws it given reference to a java.awt.Graphics object
 * @author a.yusupova
 */
public class Ellipse extends StretchableFigure{
    
    /**
     * 
     * @param r1 horizontal radius
     * @param r2 vertical radius
     * @param g java.awt.Graphics object to draw the ellipse on
     */
    protected int r1; 
    protected int r2;
    
    /**
     * 
     * Constructor
     * @param r1 horizontal radius
     * @param r2 vertical radius
     * @param g java.awt.Graphics object to draw the circle on
     */
    public Ellipse(int r1, int r2, java.awt.Graphics g)
    {
        this.r1 = r1;
        this.r2 = r2;
        this.graphics = g;
    }
    
    /**
     *
     * @return vertical radius 
     */
    public int verticalRadius(){return this.r2;}

    /**
     *
     * @return horizontal radius
     */
    public int horizontalRadius(){return this.r1;}
    
    /**
     *
     * Set ellipse horizontal radius of @param r size
     * @param r horizontal ellipse size
     */
    public void setHorizontalRadius(int r){
        hide();
        this.r1 = r;
        show();
    }
    
    /**
     *
     * Set ellipse vertical radius of @param r size
     * @param r vertical ellipse size
     */
    public void setVerticalRadius(int r){
        hide();
        this.r2 = r;
        show();
    }
    
    /**
     *
     * @return String with the name of the figure type
     */
    @Override
    public String typeName() {
        return "Ellipse";
    }
    
    /**
     * Draws the figure on the Graphics object provided in constructor
     */
    @Override
    public void show(){
        Color oldC=graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.drawOval(position.x, position.y, 
                          (int)(r1*this.scaleX*this.size), (int)(r2*this.scaleY*this.size));
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
                          (int)(r1*this.scaleX*this.size), (int)(r2*this.scaleY*this.size));
        graphics.setColor(oldC);
    }

    
}
