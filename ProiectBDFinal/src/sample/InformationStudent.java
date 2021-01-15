package sample;

import controller.SignInHelper;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.Background;
import javafx.scene.text.TextAlignment;
import javafx.util.Callback;

import java.awt.*;

public class InformationStudent {
    @FXML
    private ListView<String> informationStudent;

    public void initialize(){
        informationStudent.setItems(SignInHelper.informationStudent());
        informationStudent.setFixedCellSize(50);

        informationStudent.setCellFactory(new Callback<>() {
            @Override
            public ListCell<String> call(ListView<String> informationList) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(String info, boolean b) {
                        super.updateItem(info, b);
                        if (b) {
                            setText(null);
                        } else {
                            setText(info);
                            setTextAlignment(TextAlignment.CENTER);
                        }
                    }
                };
            }
        });
    }
}
