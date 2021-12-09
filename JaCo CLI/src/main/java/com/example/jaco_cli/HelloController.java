package com.example.jaco_cli;

import com.example.jaco_cli.datafetch.DataProviderService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JaCo Application!");
        //new DataFetcher().fetcher();
        new DataProviderService().getData("India");
    }
}