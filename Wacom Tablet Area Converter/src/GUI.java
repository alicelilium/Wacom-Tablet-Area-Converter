import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GUI extends Application {

    private TextField widthInput;
    private TextField heightInput;
    private TextField xOffsetInput;
    private TextField yOffsetInput;
    private Label topLabel;
    private Label bottomLabel;
    private Label leftLabel;
    private Label rightLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tablet Dimensions Calculator");

        // Create input fields and labels
        Label widthLabel = new Label("Tablet width:");
        widthInput = new TextField();

        Label heightLabel = new Label("Tablet height:");
        heightInput = new TextField();

        Label xOffsetLabel = new Label("Tablet X Offset:");
        xOffsetInput = new TextField();

        Label yOffsetLabel = new Label("Tablet Y Offset:");
        yOffsetInput = new TextField();

        topLabel = new Label();
        bottomLabel = new Label();
        leftLabel = new Label();
        rightLabel = new Label();

        // Create calculate button
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> calculate());

        // Add elements to grid pane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(widthLabel, 0, 0);
        gridPane.add(widthInput, 1, 0);
        gridPane.add(heightLabel, 0, 1);
        gridPane.add(heightInput, 1, 1);
        gridPane.add(xOffsetLabel, 0, 2);
        gridPane.add(xOffsetInput, 1, 2);
        gridPane.add(yOffsetLabel, 0, 3);
        gridPane.add(yOffsetInput, 1, 3);
        gridPane.add(calculateButton, 1, 4);
        gridPane.add(new Label("Top:"), 0, 5);
        gridPane.add(topLabel, 1, 5);
        gridPane.add(new Label("Bottom:"), 0, 6);
        gridPane.add(bottomLabel, 1, 6);
        gridPane.add(new Label("Left:"), 0, 7);
        gridPane.add(leftLabel, 1, 7);
        gridPane.add(new Label("Right:"), 0, 8);
        gridPane.add(rightLabel, 1, 8);

        // Add grid pane to scene
        Scene scene = new Scene(gridPane, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate() {
        // variables
        double width = Double.parseDouble(widthInput.getText());
        double height = Double.parseDouble(heightInput.getText());
        double xOffset = Double.parseDouble(xOffsetInput.getText());
        double yOffset = Double.parseDouble(yOffsetInput.getText());
        double right;
        double left;
        double bottom;
        double top;

        // formulas
        right = (100.0 * xOffset) + (50.0 * width);
        left = right - (100.0 * width);
        bottom = (100.0 * yOffset) + (50.0 * height);
        top = bottom - (100.0 * height);

        // update labels
        topLabel.setText(String.valueOf(top));
        bottomLabel.setText(String.valueOf(bottom));
        leftLabel.setText(String.valueOf(left));
        rightLabel.setText(String.valueOf(right));
    }

    public static void main(String[] args) {
        launch(args);
    }
}