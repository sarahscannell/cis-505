/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ScannellFutureValueApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setPrefSize(300,300);
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(lblPayment, 0, 0);
        pane.add(txtPayment, 1, 0);
        pane.add(lblRate, 0, 1);
        pane.add(txtRate, 1, 1);

        lblRateFormat.setTextFill(Color.RED);
        pane.add(lblRateFormat, 1, 2);
        GridPane.setHalignment(lblRateFormat, HPos.RIGHT);

        pane.add(lblYears, 0, 3);
        cboYears.setPrefWidth(165);
        pane.add(cboYears, 1, 3);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalc);
        pane.add(actionBtnContainer, 1, 4);

        pane.add(txtResult, 0, 5, 2, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private TextField txtPayment = new TextField();
    private TextField txtRate = new TextField();
    private TextArea txtResult = new TextArea();
    private Label lblPayment = new Label("Monthly Payment:");
    private Label lblRate = new Label("Interest Rate:");
    private Label lblRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lbl5 = new Label(); // Not sure what I need a 5th label for but it did say to create 5 labels
    private ComboBox<Integer> cboYears = new ComboBox<>();
    private Button btnClear = new Button("Clear");
    private Button btnCalc = new Button("Calculate");
}