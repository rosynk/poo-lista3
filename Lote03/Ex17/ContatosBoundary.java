package Ex17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ContatosBoundary extends Application {

    TextField txtId = new TextField();
    TextField txtNome = new TextField();
    TextField txtTelefone = new TextField();

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();

        ColumnConstraints colLabels = new ColumnConstraints();
        colLabels.setPercentWidth(30);

        ColumnConstraints colTextFields = new ColumnConstraints();
        colTextFields.setPercentWidth(70);
        pane.getColumnConstraints().addAll(colLabels, colTextFields);

        Scene scn = new Scene(pane, 600, 105);

        // ID
        pane.add(new Label("ID"), 0, 0);
        pane.add(txtId, 1, 0);

        // Nome
        pane.add(new Label("Nome"), 0, 1);
        pane.add(txtNome, 1, 1);

        // Telefone
        pane.add(new Label("Telefone"), 0, 2);
        pane.add(txtTelefone, 1, 2);

        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");

        pane.add(btnSalvar, 0, 3);
        pane.add(btnPesquisar, 1, 3);

        stage.setScene(scn);
        stage.setTitle("Agenda de Contatos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
