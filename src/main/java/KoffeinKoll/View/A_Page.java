package KoffeinKoll.View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class A_Page extends Application {
    private Stage stage;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        stage.setTitle("KoffeinKoll - Caffeine Management Tool");
        stage.setWidth(800);
        stage.setHeight(800);

        // Creating labels
        Label titleLabel = new Label("KoffeinKoll");
        titleLabel.setFont(Font.font("Dialog", 46));

        // Creating a BorderPane layout
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20));

        // Creating a VBox
        HBox topHBox = new HBox();
        topHBox.getChildren().add(titleLabel);
        topHBox.setAlignment(Pos.CENTER);
        borderPane.setTop(topHBox);

        // Creating a Scene and adding the BorderPane to it
        Scene scene = new Scene(borderPane, 800, 800);

        // Setting background color as a gradient centered with yellow in the middle
        Stop[] stops = new Stop[]{new Stop(0, Color.web("#c0dbad")), new Stop(1, Color.web("#fcf1cb"))};
        LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        borderPane.setBackground(new javafx.scene.layout.Background(new javafx.scene.layout.BackgroundFill(gradient, null, null)));

        // Setting the Scene to the Stage
        stage.setScene(scene);

        // Displaying the Stage
        stage.show();
    }
}
