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
public class InformingSquare extends Square implements additionalfigures.ICalcArea, additionalfigures.IInforming, additionalfigures.IScalable {

    public InformingSquare(int width, Graphics g) {
        super(width, g);
    }
    
    @Override
    public String typeName(){
        return "InformingSquare";
    }
    
    
    @Override
    public double getArea() {
        return width*width;
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
        return (int)(this.size*this.width);
    }

    @Override
    public void setSize(int newSize) {
        this.size = ((float)newSize)/width;
    }
    
}
