package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
         //Parent root = FXMLLoader.load(getClass().getResource("profesor.fxml"));
        primaryStage.setTitle("Platform UTCN");
        primaryStage.setScene(new Scene(root, 1200, 700));
        primaryStage.setMinHeight(700);
        primaryStage.setMinWidth(1200);
        primaryStage.setMaxHeight(700);
        primaryStage.setMaxHeight(1200);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
