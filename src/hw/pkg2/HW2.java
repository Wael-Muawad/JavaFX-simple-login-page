package hw.pkg2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HW2 extends Application {
    Button Login,Cancel;
    TextField t1;
    PasswordField t2;
    Label l1,l2;
    HBox hbox;
    GridPane root;
    
    @Override
    public void init(){
        Login = new Button("_Login");
        Login.setPrefSize(100, 30);
        Login.setDefaultButton(true);
        Login.setOnAction(e -> NewStage());
        
        Cancel = new Button("_Cancel");
        Cancel.setPrefSize(100, 30);
        Cancel.setCancelButton(true);
        Cancel.setOnAction(e -> Platform.exit());
        
        t1 = new TextField();
        t1.setPrefSize(0, 27);
        
        t2 = new PasswordField();
        t2.setPrefSize(0, 27);
        
        l1 = new Label("_User Name:");
        l1.setMnemonicParsing(true);
        l1.setLabelFor(t1);      
        
        l2 = new Label("_Password:");
        l2.setMnemonicParsing(true);
        l2.setLabelFor(t2);    
        
        root = new GridPane();  
        root.add(l1, 0, 0);
        root.add(t1, 2, 0, 3, 1);
        root.add(l2, 0, 2, 1, 1);
        root.add(t2, 2, 2, 3, 1);
        root.add(Login, 4, 3, 1, 1);
        root.add(Cancel, 2, 3, 1, 1);
        GridPane.setHalignment(Login, HPos.LEFT);
        GridPane.setHalignment(Cancel, HPos.RIGHT);
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(10);  
    }
    @Override
    public void start(Stage primaryStage) {  
        Scene scene = new Scene(root, 490, 289); 
        primaryStage.setTitle("Using GridPane With Mnemonics for Buttons And Labels!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    private void NewStage() {
        GridPane root2 = new GridPane();
        Scene scene2 = new Scene(root2, 700, 490);
        Stage stage2 = new Stage();  
        stage2.setTitle("New Stage");
        stage2.setScene(scene2);
        stage2.show();
    }
    
}
