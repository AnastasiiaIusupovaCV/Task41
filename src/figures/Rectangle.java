package figures;

import java.awt.Color;

/**
 * Class represents rectangle and draws it given reference to a java.awt.Graphics object
 * @author a.yusupova
 */
public class Rectangle extends StretchableFigure{
    private int width;
    private int height;
    
    /**
     *
     * Constructor
     * @param width width value
     * @param height height value
     * @param g java.awt.Graphics object to draw the rectangle on
     */
    public Rectangle(int width, int height, java.awt.Graphics g)
    {
        this.width = width;
        this.height = height;
        this.graphics = g;
    }
    
    /**
     *
     * @return width value
     */
    public int width() {return width;}

    /**
     *
     * @return height value
     */
    public int height() {return height;}
    
    /**
     *
     * Sets new width value
     * @param width new width value
     */
    public void setLocalWidth(int width){
        hide();
        this.width = width;
        show();
    }
    
    /**
     *
     * Sets new height value
     * @param height new height value
     */
    public void setLocalHeight(int height){
        hide();
        this.height = width;
        show();
    }

    /**
     *
     * @return String with the name of the figure type
     */
    @Override
    public String typeName() {
        return "Rectangle";
    }
    
    /**
     * Draws the figure on the Graphics object provided in constructor
     */
    @Override
    public void show(){
        Color oldC=graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.drawRect(position.x, position.y, 
                          (int)(this.width*this.size*this.scaleX), 
                          (int)(this.height*this.size*this.scaleY));
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
                          (int)(this.width*this.size*this.scaleX), 
                          (int)(this.height*this.size*this.scaleY));
        graphics.setColor(oldC);
    }
    

}
