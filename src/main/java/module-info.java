module com.example.cst4_turingmachine {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cst4_turingmachine to javafx.fxml;
    exports com.example.cst4_turingmachine;
}