/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_controlesvistosos_videos311_318;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Pedro
 */
public class Video318_ScrollBars extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
        TextArea miTextArea = new TextArea();
        //al llegar al límite derecho salto de línea automático
        miTextArea.setWrapText(true);
        //tamaño del área de texto
        miTextArea.setPrefSize(300, 200);

        //Crear el Scrollbar y configurar.
        //ATENCION ScrollBar es clase de JavaFX y Scrollbar de awt. NO EQUIVOCARSE
        ScrollBar miScrollBar = new ScrollBar();
        //ScrollBar vertical.
        miScrollBar.setOrientation(Orientation.VERTICAL);
        //valor máximo y mínimo
        miScrollBar.setMin(0);
        miScrollBar.setMax(100);
        //valor inicial donde se posiciona el cursor del scroll. Valor 0 arriba, 100 abajo
        miScrollBar.setValue(50);
        
        //Vinculación del scroll con el area
        miScrollBar.valueProperty().addListener((observable, valorAnterior, nuevoValor) -> {
            //posición vertical del scroll. Al llamar a este método se desplaza el scroll del aárea al nuevo valor
            miTextArea.setScrollTop(nuevoValor.doubleValue());
        });        
        
        
        //Crear contenedor 
        
        AnchorPane miAnchorPane = new AnchorPane();
        
        AnchorPane.setTopAnchor(miTextArea, 10.0);
        AnchorPane.setLeftAnchor(miTextArea, 10.0);
        
        AnchorPane.setTopAnchor(miScrollBar, 10.0);
        AnchorPane.setRightAnchor(miScrollBar, 10.0);
        
        AnchorPane.setBottomAnchor(miScrollBar, 10.0);
        
        miAnchorPane.getChildren().addAll(miScrollBar,miTextArea);
        
       
        // Configurar la escena
        Scene scene = new Scene(miAnchorPane, 350, 250);
        primaryStage.setTitle("Probando ScrollBar");
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
        

        
    }

}
