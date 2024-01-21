/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_controlesvistosos_videos311_318;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Task;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;

/**
 *
 * @author Pedro
 */
public class Video314_ProgressBar_curso extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ProgressBar miProgress = new ProgressBar();

        //Crea Label para mostrar el porcentaje;
        Label txt = new Label("txt");

        //Vincula el progress al label
        txt.textProperty().bind(
                Bindings.format("%.0f%%", miProgress.progressProperty().multiply(100))
        );

        VBox root = new VBox(10, miProgress, txt);
        root.setAlignment(Pos.CENTER);
        // Configurar la escena
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("ProgressBar ejemplo Pildoras");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Simulacion de tarea en segundo plano
        Task<Void> tarea;
        tarea = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    final int progreso = i;
                    
                    javafx.application.Platform.runLater(() -> miProgress.setProgress( progreso / 100.0));

                    Thread.sleep(50);
                    System.out.println(".call()" + progreso);
                }
                return null;
            }
        };

        //Iniciar la tarea en segundo plano
        Thread miThread = new Thread(tarea);
        miThread.start();
    }

}
