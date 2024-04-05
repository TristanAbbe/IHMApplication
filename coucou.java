import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

// Main du site
public class coucou extends Application {
    @Override
    public void start(Stage stage) {
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(coucou.class.getResource("ListeSta.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            // Définir la taille de la fenêtre pour qu'elle corresponde à la taille du projet
            stage.setScene(scene);
            stage.setTitle("Stage!");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'exception de chargement FXML
        }
    }


    public static void main(String[] args) {
        launch();
    }
}