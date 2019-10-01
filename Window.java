import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Window {
    private double x;
    private double y;
    private double diameter;


    public  Window(double x, double y, double diameter) {
        this.x = x;
        this.y= y;
        this.diameter = diameter;

    }

    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x,y,diameter);

    }
}