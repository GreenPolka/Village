import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Village {

    private double x;
    private double y;
    private double size;
    private Color color;
    private String name;
    private House house;





public Village( String name, double x, double y, Color color)
{
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;
    this.name = name;
    this.house= house;

}
public void draw(GraphicsContext gc)
{
    gc.setFill(color);
    gc.fillRect(x,y,size, size);

}
}