package sample;

import controller.SignInHelper;
import controller.formatNota;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
public class Catalog {
    @FXML
    private TableView<formatNota> listaNote;

    public void initialize(){
        listaNote.setItems(SignInHelper.catalogStudent());
    }

}
