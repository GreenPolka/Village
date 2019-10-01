import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class House {
    private double x;
    private double y;
    private double size;
    private int occupants;
    private Color color;
    private Door door;
    private Window window;



public House(double x, double y, double size, int occupants, Color color)
{
    this.x =x;
    this.y=y;
    this.size =size;
    this.color =color;
    this.occupants= occupants;
    door = new Door( x+size/3, y+size/3, size/3);
    window = new Window (x, y, diameter )

}
/**
 * Maybe this is for the empror's house
public void House( double x, double y)
{

}
*/
public void draw (GraphicsContext gc)
{
    gc.setFill(color);
    gc.fillRect(x,y,size, size);
    door.draw(gc);
    window.draw(gc);

}
/**
public void getOccupants() // check UML
{

}

public void setOccupants(int n)
{

}
public void setSize() //check UML
{

}
 */
}