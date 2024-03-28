/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package additionalfigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author anastasiia
 * @breaf Adds ability to fill the square with given color and calculate the area
 */
public class FilledSquare extends Square implements IInforming, IScalable, IFillable, ICalcArea {
    Color fillingColor;

    public FilledSquare(int width, Graphics g) {
        super(width, g);
        fillingColor = graphics.getColor();// default color
    }
    
    public FilledSquare(int width, Color fillingColor, Graphics g) {
        super(width, g);
        this.fillingColor = fillingColor;// default color
    }

    
    
    @Override
    public void hide()
    {
        super.hide();
        graphics.fillRect(position.x, position.y, 
                          width, width);
    }
    
    @Override
    public void show()
    {
        Color oldC=graphics.getColor();
        graphics.setColor(fillingColor);
        graphics.fillRect(position.x, position.y, 
                          width, width);
        graphics.setColor(oldC);
        super.show();
        
    }
    
    //IFillable
    
    @Override
    public Color getFillingColor() {
        return fillingColor;
    }

    @Override
    public void fill(Color clr) {
        hide();
        fillingColor = clr;
        show();
    }
    
    
    //ICalcArea

    @Override
    public double getArea() {
        return width*width;
    }
    
    // IInforming 
    
    @Override
    public boolean isFillable() {
        return true;
    }

    @Override
    public boolean canCalcArea() {
        return true;
    }

    @Override
    public String figureType() {
        return typeName();
    }

    @Override
    public Point position() {
        return getPosition();
    }

    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public boolean isStretchable() {
        return false;
    }
    
    
    // IScalable

    @Override
    public int getSize() {
        return width;
    }

    @Override
    public void setSize(int newSize) {
        hide();
        width = newSize;
        show();
    }
    
    // ScalableFigure
    @Override
    public void resize(int size) {
        hide();
        this.width=size;
        show();
    }
    
    @Override
    public String typeName() {
        return "FilledSquare";
    }
}
