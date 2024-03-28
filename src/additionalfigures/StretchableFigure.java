package additionalfigures;

import figures.*;
import additionalfigures.IStretchable;

/**
 * Interface for figure scaling
 * @author a.yusupova
 */
public abstract class StretchableFigure extends InformingFigure implements IStretchable{


    protected float aspectRation = 1.0f;
    protected int size = 0;
    
    
    @Override
    public boolean isStretchable()
    {
        return true;
    }
    
    @Override
    public boolean isResizable() {
        return true;
    }

 
    @Override
    public double getAspectRatio() {
        return this.aspectRation;
    }

    @Override
    public void setAspectRatio(double aspectRatio) {
        hide();
        aspectRation = (float)aspectRatio;
        show();
    }
    
    @Override
    public int getSize(){
        return this.size;
    }
    
    @Override
    public void setSize(int newSize)
    {
        hide();
        this.size = (newSize);
        show();
    }
    
    @Override
    public int getWidth(){
        return this.size;
    }
    
    @Override    
    public void setWidth(int width)
    {
        hide();
        this.size = width;
        show();
    }
    
    @Override
    public int getHeight(){
        return (int)Math.round(this.size*this.aspectRation);
    }
    
    @Override    
    public void setHeight(int height){
        hide();
        this.aspectRation = (float)height/this.size;
        show();
    }
    
}
