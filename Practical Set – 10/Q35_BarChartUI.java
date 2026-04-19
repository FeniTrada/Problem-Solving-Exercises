import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BarChart extends Application {

    public void start(Stage stage) {
        HBox hbox = new HBox(20);

        hbox.getChildren().add(createBar("Projects", 20, Color.RED));
        hbox.getChildren().add(createBar("Quizzes", 10, Color.BLUE));
        hbox.getChildren().add(createBar("Midterm", 30, Color.GREEN));
        hbox.getChildren().add(createBar("Final", 40, Color.ORANGE));

        hbox.setStyle("-fx-alignment: center;");

        Scene scene = new Scene(hbox, 500, 300);
        stage.setTitle("Grade Distribution");
        stage.setScene(scene);
        stage.show();
    }

    VBox createBar(String name, int percent, Color color) {
        Rectangle rect = new Rectangle(50, percent * 3); // scale height
        rect.setFill(color);

        Text label = new Text(name + " - " + percent + "%");

        VBox vbox = new VBox(5);
        vbox.getChildren().addAll(rect, label);

        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
