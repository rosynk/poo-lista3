package Ex16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ContatosBoundary extends Application {

    @Override
    public void start(Stage stage) {

        Pane pane1 = new Pane();
        
        Scene scn = new Scene(pane1, 350, 190);

        // ID
        Label lblID = new Label("ID:");
        lblID.relocate(20, 20);
        TextField txtID = new TextField();
        txtID.relocate(100, 20);
        txtID.setPrefWidth(200);
        
        // Nome
        Label lblNome = new Label("Nome:");
        lblNome.relocate(20, 60);
        TextField txtNome = new TextField();
        txtNome.relocate(100, 60);
        txtNome.setPrefWidth(200);

        // Telefone
        Label lblTelefone = new Label("Telefone:");
        lblTelefone.relocate(20, 100);
        TextField txtTelefone = new TextField();
        txtTelefone.relocate(100, 100);
        txtTelefone.setPrefWidth(200);

        // Botões
        Button btnSalvar = new Button("Salvar");
        btnSalvar.relocate(100, 140);

        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.relocate(200, 140);

        pane1.getChildren().addAll(lblID, txtID, lblNome, txtNome, lblTelefone, txtTelefone, btnSalvar, btnPesquisar);

        stage.setScene(scn);
        stage.setTitle("Agenda de Contatos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
