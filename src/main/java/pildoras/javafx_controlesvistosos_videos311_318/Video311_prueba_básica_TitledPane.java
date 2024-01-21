/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_controlesvistosos_videos311_318;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * Ejemplo encontrado que funciona. Según la API de JAVAFX se pueden añadir objetos Button al TitlePane pero
 * me encuentro que debo hacerlo desde un Group o no funciona
 */
public class Video311_prueba_básica_TitledPane extends Application {

    @Override
    public void start(Stage stage) {
        //Creating a Button
        Button button = new Button();
        //Setting the title of the button
        button.setText("Click Here");
        //Creating the TitlePane
        TitledPane pane = new TitledPane();
        pane.setLayoutX(200);
        pane.setLayoutY(75);
        pane.setText("Sample Titled Pane");
        //Setting contents to the titled pane
        pane.setContent(button);
        //Setting the stage
        Group root = new Group(pane);
        Scene scene = new Scene(root, 595, 150, Color.BEIGE);
        stage.setTitle("Titled Pane Example");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
