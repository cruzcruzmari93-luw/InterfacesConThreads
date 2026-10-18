package mccruz.liebreytortuga;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;

public class LiebreYTortugaController {

    @FXML private ProgressBar pbTortuga;
    @FXML private ProgressBar pbLiebre;

    @FXML
    private void iniciarCarrera() {
        new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                double progreso = i / 100.0;
                Platform.runLater(() -> pbTortuga.setProgress(progreso));
            }
        }).start();

        new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    if (i == 40) Thread.sleep(5000); // la liebre se duerme
                    else Thread.sleep(100);
                } catch (InterruptedException e) {}
                double progreso = i / 100.0;
                Platform.runLater(() -> pbLiebre.setProgress(progreso));
            }
        }).start();
    }
}
