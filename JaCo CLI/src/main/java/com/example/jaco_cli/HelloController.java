package com.example.jaco_cli;

import com.example.jaco_cli.datafetch.DataProviderService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Stage sstage;

    @FXML
    protected void onHelloButtonClick(ActionEvent event)throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("index.fxml"));
        sstage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        sstage.setScene(scene);
        sstage.show();
       // new DataFetcher().fetcher("India");
        //new DataFetcher().fetcher("USA");
        //new DataFetcher().fetcher("UK");
        //new DataFetcher().fetcher("France");
        //new DataFetcher().fetcher("China");

       // new DataProviderService().getData("India");
    }
}