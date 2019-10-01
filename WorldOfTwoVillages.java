import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class WorldOfTwoVillages extends Application {

    @Override
    public void start (Stage stage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas( 800, 800);
        stage.setTitle("The Village and the Village");
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc= canvas.getGraphicsContext2D();



    }

    public static void main (String [] args)
    {
        launch (args);
    }
}
