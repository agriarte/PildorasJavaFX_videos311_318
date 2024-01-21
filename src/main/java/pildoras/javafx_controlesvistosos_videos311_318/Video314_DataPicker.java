package pildoras.javafx_controlesvistosos_videos311_318;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Video314_DataPicker extends Application {

    @Override
    public void start(Stage stage) {
       

        BorderPane miBorderPane = new BorderPane();
        miBorderPane.setPadding(new Insets(15));
        
        
        DatePicker miDatePicker = new DatePicker();
        
        miDatePicker.setOnAction(e -> {
            LocalDate miFecha = miDatePicker.getValue();
            System.out.println("Fecha = " + miFecha);
            
        });
        
        
        miBorderPane.setTop(miDatePicker);

        Scene scene = new Scene(miBorderPane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
