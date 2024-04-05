import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Jessaye implements Initializable {

    @FXML
    private StackPane root;

    @FXML
    private JFXDialog dialog;

    @FXML
    private JFXButton acceptButton;

    @FXML
    private JFXButton declineButton;

    @FXML
    void showDialog(ActionEvent event) {
        dialog.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //dialog.setTransitionType(JFXDialog.DialogTransition.NONE);
        dialog.setDialogContainer(root);

        declineButton.setOnAction(actionEvent -> {
            System.out.println("Declined!");
            dialog.close();
        });

        acceptButton.setOnAction(actionEvent -> {
            System.out.println("Accepted");
            dialog.close();
        });
    }
}