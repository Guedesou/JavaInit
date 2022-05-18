module guedes.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens guedes.olamundojavafx to javafx.fxml;
    exports guedes.olamundojavafx;
}
