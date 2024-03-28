/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package additionalfigures;

import java.awt.Point;

/**
 *
 * @author anastasiia
 * чтобы фигура тем или иным способом сообщала о себе информацию по тем или иным параметрам:
 * имя, 
 * координату, 
 * способность менять размер, 
 * способность растягиваться, 
 * способность закрашиваться, 
 * способность вычислять свою площадь
 */
public interface IInforming {
    
    String name();
    String figureType();
    
    Point position();
    
    boolean isResizable();
    boolean isStretchable();
    boolean isFillable();
    boolean canCalcArea();
}
