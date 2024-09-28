package com.book.shop;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NoTileBar {

    private double xOffset = 0;
    private double yOffset = 0;
    
    public void notileBar(String fxmlFileName) throws Exception{

        Stage  stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFileName));
        Pane root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.setFill(Color.WHITE);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
        // Add mouse pressed event to capture initial position
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        // Add mouse dragged event to move the stage
        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }
}
