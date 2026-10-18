module mccruz.conteoclic {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mccruz.conteoclic to javafx.fxml;
    exports mccruz.conteoclic;
}
