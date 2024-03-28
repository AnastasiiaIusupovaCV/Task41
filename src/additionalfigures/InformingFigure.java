/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package additionalfigures;

import java.awt.Point;

/**
 *
 * @author anastasiia
 */
public abstract class InformingFigure extends figures.Figure implements IInforming {
    
    @Override
    public String name()
    {
        return super.name();
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
        return false;
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
        return false;
    }
    
}
