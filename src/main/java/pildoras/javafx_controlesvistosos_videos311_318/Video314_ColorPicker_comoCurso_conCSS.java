package pildoras.javafx_controlesvistosos_videos311_318;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Video314_ColorPicker_comoCurso_conCSS extends Application {

    BorderPane miBorderPane;

    @Override
    public void start(Stage stage) {
        //crear Color Picker (solo 1 línea)
        ColorPicker miColorPicker = new ColorPicker(Color.CORAL);

        //evento de seleccionar color
        miColorPicker.setOnAction((event) -> {
            Color c = miColorPicker.getValue();

            miBorderPane.setStyle("-fx-background-color: " + AColorRGB(miColorPicker.getValue()) + ";");
        });

        miBorderPane = new BorderPane();
        miBorderPane.setPadding(new Insets(15));
        miBorderPane.setTop(miColorPicker);

        Scene scene = new Scene(miBorderPane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private String AColorRGB(Color color) {
        // La cadena de formato "%02X%02X%02X" indica cómo se formatearán los componentes de color en hexadecimal.
        // El "%02X" asegura que se utilicen al menos dos caracteres y que los números se muestren en mayúsculas.
        return String.format("#%02X%02X%02X",
                // El primer %02X toma el componente rojo del color y lo convierte a hexadecimal.
                (int) (color.getRed() * 255),
                // El segundo %02X toma el componente verde del color y lo convierte a hexadecimal.
                (int) (color.getGreen() * 255),
                // El tercer %02X toma el componente azul del color y lo convierte a hexadecimal.
                (int) (color.getBlue() * 255)
        );
    }
}