module mccruz.liebreytortuga {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mccruz.liebreytortuga to javafx.fxml;
    exports mccruz.liebreytortuga;
}
