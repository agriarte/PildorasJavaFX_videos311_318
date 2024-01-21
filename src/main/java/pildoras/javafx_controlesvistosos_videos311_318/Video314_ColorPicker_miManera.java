package pildoras.javafx_controlesvistosos_videos311_318;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Video314_ColorPicker_miManera extends Application {
    
    BorderPane miBorderPane;

    @Override
    public void start(Stage stage) {
        //crear Color Picker (solo 1 línea)
        ColorPicker miColorPicker = new ColorPicker(Color.CORAL);

        //evento de seleccionar color
        miColorPicker.setOnAction((event) -> {
            Color c = miColorPicker.getValue();

            //cambiar color de fondo del PANE
            BackgroundFill colorFondo = new BackgroundFill(c, null, null);
            Background background = new Background(colorFondo);
            miBorderPane.setBackground(background);
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
}