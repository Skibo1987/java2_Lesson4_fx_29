package sample_1;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public Button btn1;

    @FXML
    public void clickClose(ActionEvent actionEvent) {
        Platform.runLater(()->{
            Stage stage = (Stage) btn1.getScene().getWindow();
//            stage.setTitle("NewTitle");
            stage.close();
        });

    }
}

