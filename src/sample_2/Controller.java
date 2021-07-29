package sample_2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.Random;

public class Controller {
    @FXML
    public Button addBtn;
    @FXML
    public VBox vbox;

    private Random random = new Random();


    public void clickAddButton(ActionEvent actionEvent) {
        int x = random.nextInt(100);
        Button button=new Button("btn #" + x);
        vbox.getChildren().add(button);
        button.setOnAction(event -> {
            System.out.println(x);
        });
    }
}

