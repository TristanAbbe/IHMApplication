import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import com.jfoenix.controls.JFXButton;
import javafx.scene.layout.StackPane;

public class MainController extends Application {



// je tente des trucs ici aussi (vous pouvez retirer le extends application au besoin)
    private Label myLabel;

    public static void main(String[] args) {
        launch(); // Appel du point d'entrée de l'application JavaFx (voir ci-dessous)
    }

    @Override
    public void start(Stage primaryStage) {

        // Définition du titre de la fenêtre de l'application
        primaryStage.setTitle("JavaFX Example");

        // Appel d'une méthode permettant une fermeture propre de l'application
        primaryStage.setOnCloseRequest(e -> Platform.exit());

        // On crèe le label
        myLabel = new Label("Hello World !");
        myLabel.setAlignment(Pos.CENTER);
        // Création de la scène (avec des dimensions correspondant à une résolution HD), composé uniquement d'une étiquette affichant du texte
        primaryStage.setScene(new Scene(myLabel, 180, 120));

        // Affichage de la fenêtre
        primaryStage.show();
    }





    @FXML
    private Button ajoutStageButton;

    @FXML
    private Button listeStageButton;

    @FXML
    private Button aideButton;

    @FXML
    private Button quitterButton;

    @FXML
    private void initialize() {
        // Vous pouvez ajouter des initialisations ici si nécessaire
    }

    @FXML
    private void handleAjoutStage() {
        System.out.println("Bouton Ajouter Stage cliqué");
        // Ajoutez votre code pour l'action d'ajout de stage ici
    }

    @FXML
    private void handleListeStage() {
        System.out.println("Bouton Liste Stage cliqué");
        // Ajoutez votre code pour l'action de liste de stage ici
    }

    @FXML
    private void handleAide() {
        System.out.println("Bouton Aide cliqué");
        // Ajoutez votre code pour l'action d'aide ici
    }

    @FXML
    private void handleQuitter() {
        System.out.println("Bouton Quit cliqué");
        // Ajoutez votre code pour l'action de quitter ici
    }
}
