/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package figures;

import java.awt.Point;

/**
 *
 * @author anastasiia
 */
public interface IMovable {
    
    void moveTo(int x, int y);
    void moveTo(Point to);
    
    void shift(int dx, int dy);
    void shift(Point dp);
    
    
}
