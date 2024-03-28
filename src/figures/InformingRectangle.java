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
public class InformingRectangle extends Rectangle implements additionalfigures.ICalcArea, additionalfigures.IInforming,
        additionalfigures.IStretchable{

    public InformingRectangle(int width, int height, Graphics g) {
        super(width, height, g);
    }
    
    
    @Override
    public String typeName(){
        return "InformingRectangle";
    }
    
    
    @Override
    public double getArea() {
        return this.height()*this.width();
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
        return true;
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
    public double getAspectRatio() {
        return this.scaleY*height()/this.scaleX/width();
    }

    @Override
    public void setAspectRatio(double aspectRatio) {
        this.scaleY = this.scaleX*(float)aspectRatio*width()/height();
    }

    @Override
    public int getWidth() {
        return (int)(this.size*this.scaleX*this.width());
    }

    @Override
    public int getHeight() {
        return (int)(this.size*this.scaleY*this.height());
    }

    @Override
    public int getSize() {
        return this.getWidth();
    }

    @Override
    public void setSize(int newSize) {
        this.size = ((float)newSize)/this.scaleX/this.width();
    }

    @Override
    public void setWidth(int width) {
        this.setLocalWidth((int)(width/this.scaleX/this.size));
    }

    @Override
    public void setHeight(int height) {
        this.setLocalHeight((int)(height/this.scaleY/this.size));
    }
    
}
