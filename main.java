import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class MainController {

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
