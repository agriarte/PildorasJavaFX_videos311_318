package pildoras.javafx_controlesvistosos_videos311_318;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Video313_ColorPicker extends Application {

    @Override
    public void start(Stage stage) {
        //crear Color Picker (solo 1 línea)
        ColorPicker miColorPicker = new ColorPicker(Color.CORAL);

        //evento de seleccionar color
        miColorPicker.setOnAction((event) -> {
            Color c = miColorPicker.getValue();


            //Valores RGB de 0.0 a 1.0
            System.out.println("Color RGB de 0.0 a 1.0 = " + c.getRed() + " " + c.getGreen() + " " + c.getBlue());

            //Valores RGB de 0 a 255
            System.out.println("Color RGB de 0 a 255= " + (c.getRed() * 255) + " " + (c.getGreen() * 255) + " " + (c.getBlue() * 255));

            //valor Hex desglosado
            System.out.println("New Color's Hex = #" + Integer.toHexString((int) (c.getRed() * 255))
                    + " " + Integer.toHexString((int) (c.getGreen() * 255))
                    + " " + Integer.toHexString((int) (c.getBlue() * 255)));
                        
            //OJO! aqui se toma el valor del ColorPicker. Devuelve Hex en un solo bloque
            System.out.println("Color RGB en HEX 0# = " + miColorPicker.getValue() );

           
        });

        BorderPane miBorderPane = new BorderPane();
        miBorderPane.setPadding(new Insets(15));
        miBorderPane.setTop(miColorPicker);

        Scene scene = new Scene(miBorderPane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
