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
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Pedro
 */
public class Video316_317_Sliders2 extends Application {

    private ProgressIndicator progressIndicator;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Llamada al método que devuelve un Slider dentro de un VBox
        VBox sliderBox1 = fabricaSliders(100);
        VBox sliderBox2 = fabricaSliders(50);
        VBox sliderBox3 = fabricaSliders(75);
        VBox sliderBox4 = fabricaSliders(35);
        VBox sliderBox5 = fabricaSliders(10);
        
        HBox miHBox = new HBox(50, sliderBox1, sliderBox2, sliderBox3, sliderBox4, sliderBox5);
        miHBox.setAlignment(Pos.CENTER);

        StackPane root = new StackPane();

        // agregar el slider al pane, crear escena, etc
        root.getChildren().add(miHBox);
        
        Scene scene = new Scene(root, 640, 480);

        // Configurar la escena en el escenario principal
        primaryStage.setTitle("Sliders");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox fabricaSliders(int valorInicial) {
        // Texto con el valor del Slider
        Text miTexto = new Text();
        miTexto.setFont(new Font("sans-serif", 14));

        // Crear un Slider vertical
        Slider miSlider = new Slider();
        
        miSlider.setOrientation(Orientation.VERTICAL); // Orientación vertical
        miSlider.setPrefHeight(150); // Altura preferida
        miSlider.setShowTickMarks(true); // Mostrar marcas de graduación
        miSlider.setMajorTickUnit(10); // Configurar la unidad principal de las marcas de graduación
        miSlider.setMinorTickCount(0); // Configurar la cantidad de marcas secundarias entre las principales
        miSlider.setMax(100); // Establecer el valor máximo del Slider
        miSlider.setShowTickLabels(true); // Mostrar etiquetas de las marcas de graduación
        miSlider.setValue(valorInicial);// Establecer el valor inicial del Slider

        // Listener del Slider que detecta los cambios de valor
        miSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            int valor = newValue.intValue();

            miTexto.setText(Integer.toString(valor));
        });

        // Crear VBox que contiene el Slider y el Text
        VBox miVBox = new VBox(10, miSlider, miTexto);
        miVBox.setPadding(new Insets(10));
        miVBox.setAlignment(Pos.CENTER);
        miVBox.setPrefWidth(20);
        miVBox.setMinWidth(20);
        miVBox.setMaxWidth(20);

        return miVBox;

    }
}
