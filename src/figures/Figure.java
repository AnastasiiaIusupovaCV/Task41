package figures;

import java.awt.Point;

/**
 * Base abstract class for all figures
 * @author a.yusupova
 */
public abstract class Figure implements IMovable{

    /**
     * Position of the figure
     */
    protected Point position = new Point();//< position x,y in pixels

    /**
     * Rotation of the figure (not used yet)
     */
    protected float rotation;///< rotation in rad

    /**
     * Figure name
     */
    protected String name;

    /**
     * Figure line color
     */
    protected java.awt.Color color;

    /**
     * Pointer to graphics object that the figure is to be drawn on
     */
    protected java.awt.Graphics graphics;

    /**
     * Background color. Used to erase the figure when hide() is called
     */
    protected java.awt.Color bgColor;

    /**
     * 

     * @return string with name of figure type
     */
    public abstract  String typeName();
    
    /**
     *
     * Moves figure center point position to given point
     * @param x new X coordinate 
     * @param y new Y coordinate 
     */
    @Override
    public void moveTo(int x, int y){
        hide();
        this.position.x = x;
        this.position.y = y;
        show();
    }
    
    
    @Override
    public void moveTo(Point to)
    {
        this.position.setLocation(to);
    }
    
    @Override
    public void shift(int dx, int dy)
    {
        this.position.x += dx; 
        this.position.y += dy;
    }
    
    @Override
    public void shift(Point dp)
    {
        
        this.position.x += dp.x; 
        this.position.y += dp.y;
    }
    
    
    /**
     *
     * Rotates figure to given angle
     * @param angle angle of figure rotation in rad
     */
    public void rotateTo(float angle){
        hide();
        this.rotation = angle;
        show();
    }
    
    /**
     *
     * @return figure angle of rotation in rad
     */
    public float getRotation(){return rotation;}

    /**
     *
     * @return figure center point position
     */
    public Point getPosition(){return position;}

    /**
     *
     * Set new figure name
     * @param name new figure name
     */
    public void setName(String name){this.name = name;}

    /**
     *
     * @return figure name
     */
    public String name(){return this.name;}
    
    /**
     *
     * @return figure color
     */
    public java.awt.Color color(){ return color;}

    /**
     * Set new figure color
     * @param clr new figure color
     */
    public void setColor(java.awt.Color clr){
        hide();
        this.color = clr;
        show();
    }
    
    /**
     *
     * @return background color
     */
    public java.awt.Color backgroundColor(){ return bgColor;}

    /**
     * 
     * Set new background color
     * @param clr new background color
     */
    public void setBackgroundColor(java.awt.Color clr){
        hide();
        this.bgColor = clr;
        show();
    }
    
    /**
     * Draws the figure on the Graphics object provided in constructor
     */
    public void show() {
        Point p = this.getPosition();
        System.out.println(this.typeName()+".show @ (" + p.x+", "+p.y+")");
        
    }

    /**
     * Removes the figure from the Graphics object provided in constructor
     * Note that an appropriate background color must be set in order to draw 
     * over the existing figure!
     */
    public void hide() {
        Point p = this.getPosition();
        System.out.println(this.typeName()+".hide @ (" + p.x+", "+p.y+")");
    }
}
