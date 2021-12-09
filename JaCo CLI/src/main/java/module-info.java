module com.example.jaco_cli {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires com.google.gson;


    opens com.example.jaco_cli to javafx.fxml;
    exports com.example.jaco_cli;
}