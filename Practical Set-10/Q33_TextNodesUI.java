import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class TextDisplay extends Application {

    public void start(Stage stage) {
        VBox vbox = new VBox(10); // spacing

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            text.setFont(Font.font("Times New Roman", 
                    FontWeight.BOLD, FontPosture.ITALIC, 22));

            Color color = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
            text.setFill(color);

            text.setOpacity(0.3 + rand.nextDouble() * 0.7);

            vbox.getChildren().add(text);
        }

        vbox.setStyle("-fx-alignment: center;");

        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("Random Texts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
