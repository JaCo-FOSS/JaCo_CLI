package com.example.jaco_cli;

import com.example.jaco_cli.datafetch.DataProviderService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.DataInput;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
       // Scene scene = new Scene(new StackPane(new Label("JavaFX")), 200,200);
       // stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
       // new DataProviderService().getData("India");
    }

    public static void main(String[] args) {
        launch();
    }
}