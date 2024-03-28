package figures;

import java.awt.Color;

/**
 * Class represents square and draws it given reference to a java.awt.Graphics object
 * @author a.yusupova
 */
public class Square extends ScalableFigure{
    protected int width;
    
    /**
     *
     * Constructor
     * @param width width value
     * @param g java.awt.Graphics object to draw the square on
     */
    public Square(int width, java.awt.Graphics g){
        this.width = width;
        this.graphics = g;
    }
    
    /**
     *
     * @return width value
     */
    public int width() {return width;}

     /**
     * Sets new width value
     * @param width new width value
     */
    public void setWidth(int width){
        hide();
        this.width = width;
        show();
    }

    /**
     *
     * @return String with the name of the figure type
     */
    @Override
    public String typeName() {
        return "Square";
    }
    
    /**
     * Draws the figure on the Graphics object provided in constructor
     */
    @Override
    public void show(){
        Color oldC=graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.drawRect(position.x, position.y, 
                          (int)(this.width*this.size), (int)(this.width*this.size));
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
        graphics.drawRect(position.x, position.y, 
                          (int)(this.width*this.size), (int)(this.width*this.size));
        graphics.setColor(oldC);
    }
}
