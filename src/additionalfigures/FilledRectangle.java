/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package additionalfigures;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author anastasiia
 * @breaf Fillable rectangle with given color. Area calculation 
 */
public class FilledRectangle extends Rectangle implements ICalcArea, IFillable {
    Color fillingColor;

    public FilledRectangle(int width, int height, Graphics g) {
        super(width, height, g);
        fillingColor = g.getColor();
    }
    
    public FilledRectangle(int width, int height, Color fillClr, Graphics g) {
        super(width, height, g);
        fillingColor = fillClr;
    }
    
    
    //ICalcArea
    @Override
    public double getArea() {
        return getWidth()*getHeight();
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
    
    //IInforming
    @Override
    public boolean isFillable() {
        return true;
    }

    @Override
    public boolean canCalcArea() {
        return true;
    }
    
    
    //Rectangle
    
    @Override
    public void hide(){
        super.hide();
        graphics.fillRect(position.x, position.y, 
                          this.getWidth(), this.getHeight());
    }
    
    @Override
    public void show(){
        Color oldC=graphics.getColor();
        graphics.setColor(fillingColor);
        graphics.fillRect(position.x, position.y, 
                          this.getWidth(), this.getHeight());
        graphics.setColor(oldC);
        super.show();
    }
    
    
    @Override
    public String typeName() {
        return "FilledRectangle";
    }
    
    
    
}
