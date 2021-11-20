/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Oracle. (2015). JavaFX 8. Oracle Help Center. Retrieved November 8, 2021,
    from https://docs.oracle.com/javase/8/javafx/api/toc.htm

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import java.io.*;
import java.util.ArrayList;

public class ScannellGradeBookApp extends Application {
    
    /**
     * Overridden start method
     * @param primaryStage Stage
     */
    @Override
    public void start(Stage primaryStage) {
        
        // Colors
        Color ltYellow = new Color(0.96863, 0.97255, 0.89020, 1);
        Color dkGreen = new Color(0.26667, 0.38039, 0.16078, 1);
        Color mdGreen = new Color(0.57255, 0.65098, 0.37255, 1);

        // Fonts
        Font fntHeader = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 15);
        Font fntButton = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);

        /* Main Pane */
        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        mainPane.setPrefSize(300,325);
        mainPane.setHgap(5.5);
        mainPane.setVgap(5.5);
        mainPane.setBackground(new Background(new BackgroundFill(ltYellow, CornerRadii.EMPTY, Insets.EMPTY)));

        // Title "Grade Book App"
        lblTitle.setTextFill(dkGreen);
        lblTitle.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        mainPane.add(lblTitle, 0, 0, 2, 1);
        GridPane.setHalignment(lblTitle, HPos.CENTER);

        // View Grades button
        btnView.setTextFill(dkGreen);
        btnView.setFont(fntButton);
        btnView.setPrefWidth(250);
        mainPane.add(btnView, 0, 1, 2, 1);
        GridPane.setHalignment(btnView, HPos.CENTER);

        // Header 1 - "Students Information"
        lblHeader1.setTextFill(mdGreen);
        lblHeader1.setFont(fntHeader);
        mainPane.add(lblHeader1, 0, 2, 2, 1);
        GridPane.setHalignment(lblHeader1, HPos.CENTER);

        // Labels and text fields - Name and Surname
        mainPane.add(lblName, 0, 3);
        mainPane.add(txtName, 1, 3);

        mainPane.add(lblSurname, 0, 4);
        mainPane.add(txtSurname, 1, 4);

        // Header 2 - "Course Information"
        lblHeader2.setTextFill(mdGreen);
        lblHeader2.setFont(fntHeader);
        lblHeader2.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        mainPane.add(lblHeader2, 0, 5, 2, 1);
        GridPane.setHalignment(lblHeader2, HPos.CENTER);

        // Labels, text fields, and combo box - Course and Grade
        mainPane.add(lblCourse, 0, 6);
        mainPane.add(txtCourse, 1, 6);

        mainPane.add(lblGrade, 0, 7);
        mainPane.add(cboGrade, 1, 7);
        cboGrade.getItems().addAll("A", "B", "C", "D", "F");
        cboGrade.setPrefWidth(165);

        // Save and Clear buttons
        btnSave.setTextFill(dkGreen);
        btnSave.setFont(fntButton);
        btnSave.setPrefWidth(80);

        btnClear.setTextFill(dkGreen);
        btnClear.setFont(fntButton);
        btnClear.setPrefWidth(80);

        // Button HBox container
        HBox hboxBtnContainer = new HBox();
        hboxBtnContainer.setPadding(new Insets(15,0,15,30));
        hboxBtnContainer.setSpacing(10);
        hboxBtnContainer.getChildren().add(btnClear);
        hboxBtnContainer.getChildren().add(btnSave);
        mainPane.add(hboxBtnContainer, 1, 8);

        // Save successful notification
        mainPane.add(lblSaveNotif, 0, 9, 2, 1);
        GridPane.setHalignment(lblSaveNotif, HPos.RIGHT);

        /* Results Pane */
        GridPane resultsPane = new GridPane();
        resultsPane.setAlignment(Pos.CENTER);
        resultsPane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        resultsPane.setPrefSize(300,300);
        resultsPane.setHgap(5.5);
        resultsPane.setVgap(5.5);
        resultsPane.setBackground(new Background(new BackgroundFill(ltYellow, CornerRadii.EMPTY, Insets.EMPTY)));

        // Title "Grade Book App"
        lblTitle2.setTextFill(dkGreen);
        lblTitle2.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        resultsPane.add(lblTitle2, 0, 0, 2, 1);
        GridPane.setHalignment(lblTitle2, HPos.CENTER);

        // Subheader - "Current Grade"
        lblResults.setTextFill(mdGreen);
        lblResults.setFont(fntHeader);
        lblResults.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        resultsPane.add(lblResults, 0, 1, 2, 1);
        GridPane.setHalignment(lblResults, HPos.CENTER);

        // Text area to show results and button to return to main pane
        resultsPane.add(txtResults, 0, 2);
        resultsPane.add(btnReturn, 0, 3);
        btnReturn.setTextFill(dkGreen);
        btnReturn.setFont(fntButton);
        GridPane.setHalignment(btnReturn, HPos.CENTER);

        // Setting up StackPane, Scene, and Stage
        StackPane stack = new StackPane();
        stack.getChildren().addAll(resultsPane,mainPane);

        Scene scene = new Scene(stack,300,325,Color.WHITE);
        primaryStage.setTitle("Grade Book App");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Event Handlers
        btnClear.setOnAction(ev -> clearForm());
        btnSave.setOnAction(ev -> {
            try {
                saveToFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        btnView.setOnAction(ev -> {
            try {
                viewFile(stack);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        btnReturn.setOnAction(ev -> flipStacks(stack));
    }

    /**
     * Method to clear form fields and save notification
     */
    private void clearForm() {
        txtName.setText("");
        txtSurname.setText("");
        txtCourse.setText("");
        cboGrade.setValue("");
        lblSaveNotif.setText("");
    }

    /**
     * Method to save data to file, or create a new file if none exists
     * @throws IOException
     */
    private void saveToFile() throws IOException {
        if(!txtName.getText().isEmpty() && !txtSurname.getText().isEmpty() && !txtCourse.getText().isEmpty() && !cboGrade.getSelectionModel().isEmpty()) { // Check that all fields are filled
            String name = txtName.getText();
            String surname = txtSurname.getText();
            String newLine = "\n" + name + "," + surname + "," + txtCourse.getText() + "," + cboGrade.getValue();
            if(file.length() != 0) { // Check that file exists & is not blank
                try (
                    FileWriter writer = new FileWriter(file, true);
                ) {
                    writer.write(newLine);
                    writer.close();

                    clearForm();
                    lblSaveNotif.setText("Grade for " + name + " " + surname + " has been saved");
                }
            } else { // If no file exists or file is blank, adds header row + entered data
                file.createNewFile();
                try (
                    FileWriter writer = new FileWriter(file, true);
                ) {
                    writer.write("First Name,Last Name,Course Name,Grade" + newLine);
                    writer.close();

                    clearForm();
                    lblSaveNotif.setText("New grade book file created");
                }
            }
        } else { // Present user with alert if all fields are not filled in
            alert.setContentText("All fields are required. Please complete the form and try again.");
            alert.show();
        }

    }

    /**
     * Method to view data from CSV file
     * @param stack StackPane object (passed to flip stack to show results pane)
     * @throws IOException
     */
    private void viewFile(StackPane stack) throws IOException {
        if(file.exists()) { // Check that file exists
            ArrayList<Student> students = getStudents();
            String results = "";
            for(int i=0; i<students.size(); i++) {
                results += students.get(i).toString() + "\n";
            }
            txtResults.setText(results);
            flipStacks(stack);
            clearForm();
        } else { // Alert user if file does not yet exist
            alert.setContentText("File does not exist. Please add new grades to create the file.");
            alert.show();
        }
    }

    /**
     * Method to create and return Student objects from CSV file
     * @return ArrayList<Student>
     * @throws IOException
     */
    private ArrayList<Student> getStudents() throws IOException {
        String line;
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        ArrayList<Student> studentArray = new ArrayList<Student>();
        String[] lineArray;

        br.readLine(); // reads header line so it is not displayed

        while((line = br.readLine()) != null) {
            lineArray = line.split(",");
            Student tempStudent = new Student(lineArray[0], lineArray[1], lineArray[2], lineArray[3]);
            studentArray.add(tempStudent);
        }

        br.close();

        return studentArray;
    }

    /**
     * Method to flip main and results panes in StackPane
     * @param stack StackPane object
     */
    private void flipStacks(StackPane stack) {
        ObservableList<Node> panes = stack.getChildren();

        if(panes.size() > 1) {
            Node topPane = panes.get(panes.size()-1);
            topPane.toBack();
        }
    }
    
    /**
     * Main method launches application
     * @param args String[]
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    // TextFields
    private TextField txtName = new TextField();
    private TextField txtSurname = new TextField();
    private TextField txtCourse = new TextField();
    private TextArea txtResults = new TextArea();
    
    // ComboBox
    private ComboBox<String> cboGrade = new ComboBox<>();

    // Labels
    private Label lblTitle = new Label("GRADE BOOK APP");
    private Label lblTitle2 = new Label("GRADE BOOK APP");
    private Label lblHeader1 = new Label("Student Information");
    private Label lblName = new Label("First Name:");
    private Label lblSurname = new Label("Last Name:");
    private Label lblHeader2 = new Label("Course Information");
    private Label lblCourse = new Label("Name:");
    private Label lblGrade = new Label("Grade:");
    private Label lblResults = new Label("Current Grades");
    private Label lblSaveNotif = new Label("");

    // Buttons
    private Button btnClear = new Button("CLEAR");
    private Button btnSave = new Button("SAVE");
    private Button btnView = new Button("View Grades");
    private Button btnReturn = new Button("Return to add more grades");

    // Other
    private File file = new File("grades.csv");
    private Alert alert = new Alert(AlertType.NONE,"",ButtonType.OK);

    /**
     * Inner class to create Student objects
     */
    public class Student {
        private String firstName = "";
        private String lastName = "";
        private String course = "";
        private String grade = "";

        /**
         * Default constructor
         * Initializes fields with default values
         */
        Student() {
        }

        /**
         * Paramaterized constructor
         * @param firstName String
         * @param lastName String
         * @param course String
         * @param grade String
         */
        Student(String firstName, String lastName, String course, String grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
            this.grade = grade;
        }

        /**
         * toString method overridden to return String description of Student object
         * @return String
         */
        @Override
        public String toString() {
            return "Student Name: " + firstName + " " + lastName + "\nCourse Name: " + course + "\nGrade: " + grade + "\n";
        }

        /**
         * Getter method for firstName
         * @return String
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Getter method for lastName
         * @return String
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Getter method for course
         * @return String
         */
        public String getCourse() {
            return course;
        }

        /**
         * Getter method for grade
         * @return String
         */
        public String getGrade() {
            return grade;
        }

        /**
         * Setter method for firstName
         * @param firstName String
         */
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        /**
         * Setter method for lastName
         * @param lastName String
         */
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        /**
         * Setter method for course
         * @param course String
         */
        public void setCourse(String course) {
            this.course = course;
        }

        /**
         * Setter method for grade
         * @param grade String
         */
        public void setGrade(String grade) {
            this.grade = grade;
        }
    }
}
