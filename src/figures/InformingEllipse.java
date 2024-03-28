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
public class InformingEllipse extends Ellipse implements additionalfigures.IInforming,
        additionalfigures.IStretchable {

    public InformingEllipse(int r1, int r2, Graphics g) {
        super(r1, r2, g);
    }
    
    @Override
    public String typeName(){
        return "InformingEllipse";
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
        return false;
    }

    @Override
    public double getAspectRatio() {
        return this.scaleY*r2/this.scaleX/r1;
    }

    @Override
    public void setAspectRatio(double aspectRatio) {
        this.scaleY = this.scaleX*(float)aspectRatio*r1/r2;
    }


    @Override
    public int getWidth() {
        return (int)(this.size*this.scaleX*this.r1);
    }

    @Override
    public int getHeight() {
        return (int)(this.size*this.scaleY*this.r2);
    }

    @Override
    public int getSize() {
        return this.getWidth();
    }

    @Override
    public void setSize(int newSize) {
        this.size = ((float)newSize)/this.scaleX/this.r1;
    }

    @Override
    public void setWidth(int width) {
        this.r1 = (int)(((float)width)/this.scaleX/this.size);
    }

    @Override
    public void setHeight(int height) {
        this.r2 = (int)(((float)height)/this.scaleY/this.size);
    }
}
