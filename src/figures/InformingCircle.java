/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figures;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author anastasiia
 */
public class InformingCircle extends Circle implements additionalfigures.ICalcArea, additionalfigures.IInforming, additionalfigures.IScalable {

    public InformingCircle(int r, Graphics g) {
        super(r, g);
    }
    
    
    @Override
    public String typeName(){
        return "InformingCircle";
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius*this.radius);
    }

    @Override
    public String figureType() {
        return this.typeName();
    }

    @Override
    public Point position() {
        return this.position;
    }

    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public boolean isStretchable() {
        return false;
    }

    @Override
    public boolean isFillable() {
        return false;
    }

    @Override
    public boolean canCalcArea() {
        return true;
    }

    @Override
    public int getSize() {
        return (int)(this.size*radius);
    }

    @Override
    public void setSize(int newSize) {
        hide();
        this.size = ((float)newSize)/this.radius;
        show();
        
    }
    
}
