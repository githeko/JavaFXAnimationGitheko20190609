package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;



public class BallAnimation extends Application {

    public static void main(String[] args) {
        launch(args);
    }


        @Override
        public void start(Stage primaryStage) throws Exception {

            Circle ccle = new Circle();
            ccle.setCenterX(30.0);
            ccle.setCenterY(30.0);
            ccle.setRadius(40);
            //Duration = 2.5 seconds
            Duration duration = Duration.millis(5000);
            //Create new translate transition
            TranslateTransition transition = new TranslateTransition(duration, ccle);//Duration of transition and object to be translated
            //Move in X axis by +500
            transition.setByX(500);//New x-coordinate of btn
            //Move in Y axis by +500
            transition.setByY(500); //New x-coordinate of btn
            //Go back to previous position after 2.5 seconds
            transition.setAutoReverse(true);
            //Repeat animation twice
            transition.setCycleCount(4);
            transition.play();


            //Root pane
            Group group = new Group(ccle); //Add btn to root pane

            //Scene
            Scene scene = new Scene(group, 600, 600);
            //Primary Stage
            primaryStage.setScene(scene);
            primaryStage.show();
        }

    }

