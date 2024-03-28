package figures;

import java.awt.Color;
import java.awt.Point;

/**
 * Class represents triangle and draws it given reference to a java.awt.Graphics object
 * @author a.yusupova
 */
public class Triangle extends StretchableFigure{
    private Point p1;
    private Point p2;
    private Point p3;
    
    /**
     *
     * Constructor
     * @param p1 first triangle vertice position
     * @param p2 second triangle vertice position
     * @param p3 third triangle vertice position
     * @param g java.awt.Graphics object to draw the triangle on
     */
    public Triangle(Point p1,Point p2,Point p3, java.awt.Graphics g)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.graphics = g;
    }
    
    /**
     *
     * @return first triangle vertice position
     */
    public Point point1(){return this.p1;}

    /**
     *
     * @return second triangle vertice position
     */
    public Point point2(){return this.p2;}

    /**
     *
     * @return third triangle vertice position
     */
    public Point point3(){return this.p3;}
    
    /**
     * Sets new position of the first triangle vertice
     * @param p new coordinates
     */
    public void setPoint1(Point p){
        hide();
        this.p1 = p;
        show();
    }

    /**
     * Sets new position of the second triangle vertice
     * @param p new coordinates
     */
    public void setPoint2(Point p){
        hide();
        this.p2 = p;
        show();
    }

    /**
     * Sets new position of the third triangle vertice
     * @param p new coordinates
     */
    public void setPoint3(Point p){
        hide();
        this.p3 = p;
        show();
    }

    /**
     *
     * @return String with the name of the figure type
     */
    @Override
    public String typeName() {
        return "Triangle";
    }
    
    /**
     * Draws the figure on the Graphics object provided in constructor
     */
    @Override
    public void show(){
        Color oldC=graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.drawLine(position.x+p1.x, position.y+p1.y, 
                            position.x+p2.x, position.y+p2.y);
        graphics.drawLine(position.x+p2.x, position.y+p2.y, 
                            position.x+p3.x, position.y+p3.y);
        graphics.drawLine(position.x+p3.x, position.y+p3.y, 
                            position.x+p1.x, position.y+p1.y);
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
        graphics.drawLine(position.x+p1.x, position.y+p1.y, 
                            position.x+p2.x, position.y+p2.y);
        graphics.drawLine(position.x+p2.x, position.y+p2.y, 
                            position.x+p3.x, position.y+p3.y);
        graphics.drawLine(position.x+p3.x, position.y+p3.y, 
                            position.x+p1.x, position.y+p1.y);
        graphics.setColor(oldC);
    }
    
}
