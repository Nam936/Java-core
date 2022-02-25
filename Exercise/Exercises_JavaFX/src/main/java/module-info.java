module com.example.exercises_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.exercises_javafx to javafx.fxml;
    exports com.example.exercises_javafx;
}