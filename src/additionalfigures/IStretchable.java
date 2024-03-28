/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package additionalfigures;

/**
 *
 * @author a.yusupova
 */
public interface IStretchable extends  IScalable {
    
    double getAspectRatio();
    void setAspectRatio(double aspectRatio);
    int getWidth();
    void setWidth(int width);
    int getHeight();
    void setHeight(int height);
}
