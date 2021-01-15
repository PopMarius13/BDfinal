package sample;

import controller.SignInHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import model.models.Curs;

public class Cursuri {

    @FXML
    private Button delete;
    @FXML
    private TableView<Curs> listaActivitati;
    @FXML
    private Button inscriere;
    @FXML
    private TableView<Curs> listaCursuri;

    public void initialize(){
        SignInHelper.addCursuri();
        listaCursuri.setItems(SignInHelper.completionCursuri());
        inscriere.setVisible(false);
        delete.setVisible(true);
    }

    @FXML
    private void handlerClickCursurileMele(){
        listaCursuri.setItems(SignInHelper.completionCursuri());
        inscriere.setVisible(false);
        SignInHelper.setCursuri(0);
        delete.setVisible(true);
    }

    @FXML
    private void handlerClickToateCursurile(){
        listaCursuri.setItems(SignInHelper.completionCursuriToate());
        inscriere.setVisible(false);
        SignInHelper.setCursuri(1);
        delete.setVisible(false);
    }

    @FXML
    private void handlerClickRestulCursurilor(){
        listaCursuri.setItems(SignInHelper.completionCursuriRest());
        inscriere.setVisible(true);
        SignInHelper.setCursuri(2);
        delete.setVisible(false);
    }

    @FXML
    private void handlerClickTabelCursuri(){
        SignInHelper.informationCursuri(listaCursuri.getSelectionModel().getSelectedIndex());
        listaActivitati.setItems(SignInHelper.getDescriereCurs());
    }

    @FXML
    private void handlerClickEnroll(){
        SignInHelper.enrollCurs(listaCursuri.getSelectionModel().getSelectedIndex());
        SignInHelper.addCursuri();
        handlerClickRestulCursurilor();
    }

    public void handlerClickdelet() {
        SignInHelper.renuntareCurs(listaCursuri.getSelectionModel().getSelectedIndex());
        SignInHelper.addCursuri();
        handlerClickCursurileMele();
    }
}
