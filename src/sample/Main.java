package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.scene.Group;

import javafx.scene.control.Button;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btn = new Button("ClickMe");


        //Duration = 2.5 seconds
        Duration duration = Duration.millis(5000);
        //Create new translate transition
        TranslateTransition transition = new TranslateTransition(duration, btn);//Duration of transition and object to be translated
        //Move in X axis by +500
        transition.setByX(500);//New x-coordinate of btn
        //Move in Y axis by +500
        transition.setByY(500); //New x-coordinate of btn
        //Go back to previous position after 2.5 seconds
        transition.setAutoReverse(true);
        //Repeat animation twice
        transition.setCycleCount(2);
        transition.play();


        //Root pane
        Group group = new Group(btn); //Add btn to root pane

        //Scene
        Scene scene = new Scene(group, 600, 600);
        //Primary Stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
