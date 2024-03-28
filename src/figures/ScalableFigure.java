/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figures;

/**
 *
 * @author a.yusupova
 */
public abstract class ScalableFigure extends Figure {
    protected float size = 1.0f;
    
    public void resize(int size) {
        hide();
        this.size=size;
        show();
    }
    
    public float scale()
    {
        return this.size;
    }
}
