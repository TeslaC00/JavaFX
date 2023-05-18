import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // secne1(primaryStage);
        // secne2(primaryStage);
        scene3(primaryStage);
        primaryStage.show();
    }

    private void secne1(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Image logo = new Image("JavaFx_Logo.png");

        Text text = new Text("Aur bro badhiya?!");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("MV Boli", 20));
        text.setFill(Color.GREEN);

        Line line = new Line();
        line.setStartX(0);
        line.setStartY(50);
        line.setEndX(800);
        line.setEndY(50);
        line.setStrokeWidth(5);
        line.setStroke(Color.WHITE);
        line.setOpacity(0.5);
        // line.setRotate(30);

        Rectangle rectangle = new Rectangle(550, 250, 200, 200);
        rectangle.setFill(Color.RED);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.AZURE);

        // Polygon triangle = new Polygon(400,0,0,490,800,490);
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(400.0, 0.0, 0.0, 500.0, 800.0, 500.0);
        triangle.setStroke(Color.MAROON);

        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(20);
        circle.setFill(Color.ORANGE);

        Image image = new Image("JavaFx_Logo.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(420);
        imageView.setY(69);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        primaryStage.setTitle("HelloFX");
        primaryStage.setWidth(800);
        primaryStage.setHeight(500);
        // primaryStage.setFullScreen(true);
        primaryStage.getIcons().add(logo);
        primaryStage.setScene(scene);
    }

    private void secne2(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
    }

    private void scene3(Stage primaryStage){

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}