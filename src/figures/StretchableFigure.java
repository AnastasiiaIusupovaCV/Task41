package figures;


/**
 * Interface for figure scaling
 * @author a.yusupova
 */
public abstract class StretchableFigure extends ScalableFigure{

    /**
     * Value of the X scale
     */
    protected float scaleX = 1.0f;

    /**
     * Value of the Y scale
     */
    protected float scaleY = 1.0f;
    
    /**
     *
     * @return figure X scale
     */
    public float scaleX(){return this.scaleX;}

    /**
     *
     * @return figure Y scale
     */
    public float scaleY(){return this.scaleY;}
    
    /**
     *
     * Sets tne figure scale value
     * @param scale new X scale value
     */
    public void rescaleX(float scale){
        hide();
        this.scaleX = scale;
        show();
    }
    
    /**
     *
     * Sets tne figure scale value
     * @param scale new Y scale value
     */
    public void rescaleY(float scale){
        hide();
        this.scaleY = scale;
        show();
    }
    
     /**
     *
     * Sets tne figure scale value
     * @param scaleX new X scale value
     * @param scaleY new Y scale value
     */
    public void rescaleXY(float scaleX, float scaleY){
        hide();
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        show();
    }
}
