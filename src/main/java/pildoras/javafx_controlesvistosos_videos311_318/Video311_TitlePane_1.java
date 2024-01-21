package pildoras.javafx_controlesvistosos_videos311_318;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Video311_TitlePane_1 extends Application {

    @Override
    public void start(Stage stage) {

        //primer elemento del menú
        RadioButton radioPeq = new RadioButton("Pequeño");
        RadioButton radioMed = new RadioButton("Mediano");
        RadioButton radioGra = new RadioButton("Grande");

        ToggleGroup grupoRadio = new ToggleGroup();
        grupoRadio.getToggles().addAll(radioPeq, radioMed, radioGra);

        radioMed.setSelected(true);

        VBox miBox = new VBox(10);
        miBox.setPadding(new Insets(10));
        miBox.getChildren().addAll(radioPeq, radioMed, radioGra);
        // fin de primer elemento

        //segundo elemento del menú
        RadioButton radioFina = new RadioButton("Fina");
        RadioButton radioNormal = new RadioButton("Normal");
        RadioButton radioGruesa = new RadioButton("Gruesa");

        ToggleGroup grupoMasa = new ToggleGroup();
        grupoRadio.getToggles().addAll(radioFina, radioNormal, radioGruesa);

        radioMed.setSelected(true);

        VBox miBox2 = new VBox(10);
        miBox2.setPadding(new Insets(10));
        miBox2.getChildren().addAll(radioFina, radioNormal, radioGruesa);
        // fin de segundo  elemento
        
         //tercer elemento del menú
        RadioButton radioCebolla = new RadioButton("Cebolla");
        RadioButton radioPimiento = new RadioButton("Piniento");
        RadioButton radioAtun = new RadioButton("Atúb");

        ToggleGroup grupoIngredientes = new ToggleGroup();
        grupoIngredientes.getToggles().addAll(radioCebolla, radioPimiento, radioAtun);

        radioPimiento.setSelected(true);

        VBox miBox3 = new VBox(10);
        miBox3.setPadding(new Insets(10));
        miBox3.getChildren().addAll(radioCebolla, radioPimiento, radioAtun);
        // fin de segundo  elemento

        //TitlePanes
        TitledPane miTitledPane = new TitledPane();
        miTitledPane.setText("Tamaño");
        
        TitledPane miTitledPane2 = new TitledPane();
        miTitledPane2.setText("Masa");
        miTitledPane2.setCollapsible(false);
        
        TitledPane miTitledPane3 = new TitledPane();
        miTitledPane3.setText("Ingredientes");

        // Añadir el VBox al contenido del TitledPane
        miTitledPane.setContent(miBox);
        miTitledPane2.setContent(miBox2);
        miTitledPane3.setContent(miBox3);
        
        //añadir los VBox a un HBox
        HBox miHBox = new HBox(15, miTitledPane, miTitledPane2, miTitledPane3);
        miHBox.setPadding(new Insets(5));
        
        // ***IMPORTANTE***
        //Según la API de JAVAFX se pueden añadir objetos Button al TitlePane pero
        //me encuentro que debo hacerlo desde un Group o no funciona
        Group miGrupo = new Group(miHBox);
        

        Scene scene = new Scene(miGrupo, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
