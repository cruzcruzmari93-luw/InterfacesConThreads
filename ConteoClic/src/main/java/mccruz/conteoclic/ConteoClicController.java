package mccruz.conteoclic;

import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class ConteoClicController {
    @FXML private Button btnEsperar;
    @FXML private ProgressBar progressBar;
    @FXML private TextField txtClics;

    private int contador = 0;

    @FXML
    private void contarClic() {
        contador++;
        txtClics.setText(String.valueOf(contador));
    }

    @FXML
    private void esperar() {
        btnEsperar.setDisable(true);
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                final double progreso = i / 10.0;
                Platform.runLater(() -> progressBar.setProgress(progreso));
            }
            Platform.runLater(() -> btnEsperar.setDisable(false));
        }).start();
    }
}