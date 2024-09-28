package com.book.shop;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

      @Override
    public void start(Stage stage) throws IOException {
        try {
            new NoTileBar().notileBar("MainView.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeWindow(){
        System.exit(0);
    }
    public static void main(String[] args) throws Exception{
        launch();
    }

}