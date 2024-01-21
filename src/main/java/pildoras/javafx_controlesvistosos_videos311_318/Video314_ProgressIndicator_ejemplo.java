/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_controlesvistosos_videos311_318;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Pedro
 */
public class Video314_ProgressIndicator_ejemplo extends Application {

    private ProgressIndicator progressIndicator;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ProgressIndicator Example");

        // Crear un StackPane como contenedor principal
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);

        // Crear un ProgressIndicator
        progressIndicator = new ProgressIndicator();
        progressIndicator.setMinSize(100, 100);

        // Agregar el ProgressIndicator al contenedor
        root.getChildren().add(progressIndicator);

        // Configurar la escena
        Scene scene = new Scene(root, 300, 200);

        // Configurar el temporizador para actualizar el progreso cada segundo
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateProgress();
            }
        }, 0, 1000); // Actualizar cada segundo

        // Configurar la escena en el escenario principal
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateProgress() {
        // Obtener los segundos actuales de la hora del sistema
        Calendar calendar = Calendar.getInstance();
        int seconds = calendar.get(Calendar.SECOND);

        // Calcular el progreso en base a los segundos
        double progress = (double) seconds / 60.0;

        // Actualizar el ProgressIndicator en el hilo de la interfaz de usuario
        javafx.application.Platform.runLater(() -> progressIndicator.setProgress(progress));
    }
}
