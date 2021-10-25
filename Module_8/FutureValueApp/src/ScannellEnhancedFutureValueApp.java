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
import java.text.SimpleDateFormat;

public class ScannellEnhancedFutureValueApp extends Application {
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
        cboYears.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        cboYears.setValue(0);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalc);
        pane.add(actionBtnContainer, 1, 4);

        pane.add(lblValueDate, 0, 5, 2, 1);
        pane.add(txtResult, 0, 6, 2, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();

        btnClear.setOnAction(e -> clearFormFields());
        btnCalc.setOnAction(e -> calculateResults());
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
    private Label lblValueDate = new Label();
    private ComboBox<Integer> cboYears = new ComboBox<>();
    private Button btnClear = new Button("Clear");
    private Button btnCalc = new Button("Calculate");


    private void clearFormFields() {
        txtPayment.setText("");
        txtRate.setText("");
        txtResult.setText("");
        lblValueDate.setText("");
        cboYears.setValue(0);
    }

    private void calculateResults() {
        double monthlyPayment = Double.parseDouble(txtPayment.getText());
        double rate = Double.parseDouble(txtRate.getText());
        int years = cboYears.getValue();
        double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);

        lblValueDate.setText("Calculation as of " + todaysDate() + ":");
        txtResult.setText(String.format("The future value is $%,6.2f", futureValue));
    }

    private String todaysDate() {
        SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");

        return f.format(new java.util.Date());
    }
}