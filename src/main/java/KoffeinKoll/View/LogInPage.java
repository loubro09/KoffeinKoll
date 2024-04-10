package KoffeinKoll.View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LogInPage extends Application {

    private Stage logInStage;

    @Override
    public void start(Stage logInStage) {
        this.logInStage = logInStage;

        logInStage.setTitle("KoffeinKoll - Caffeine Management Tool");
        logInStage.setWidth(800);
        logInStage.setHeight(800);


        Label titleLabel = new Label("KoffeinKoll");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 46));


        Label userNameLabel = new Label("Username");
        userNameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Color labelColor = Color.rgb(0, 60, 0);
        titleLabel.setTextFill(labelColor);
        userNameLabel.setTextFill(labelColor);
        passwordLabel.setTextFill(labelColor);

        TextField userNameField = new TextField();
        userNameField.setPromptText("Enter username");
        userNameField.setFont(Font.font("Arial", 14));
        userNameField.setPrefWidth(220);
        userNameField.setPrefHeight(30);

        TextField passwordField = new TextField();
        passwordField.setPromptText("Enter password ");
        passwordField.setFont(Font.font("Arial", 14));
        passwordField.setPrefWidth(220);
        passwordField.setPrefHeight(30);

        Hyperlink registration = new Hyperlink("Not registered? Create an account!");
        registration.setFont(Font.font("Arial", 14));

        Button logInButton = new Button("Log in");
        logInButton.setPrefWidth(100);
        logInButton.setPrefHeight(30);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(userNameLabel, 0, 0);
        gridPane.add(userNameField, 0, 1);
        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(passwordField, 0, 3);
        gridPane.add(registration,0,5);
        gridPane.add(logInButton, 0, 7);
        gridPane.setHalignment(logInButton, Pos.CENTER.getHpos());


        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20));
        borderPane.setCenter(gridPane);

        // Creating a VBox for main page
        HBox topHBox = new HBox();
        topHBox.getChildren().add(titleLabel);
        topHBox.setAlignment(Pos.CENTER);
        borderPane.setTop(topHBox);

        Scene scene = new Scene(borderPane, 800, 800);

        // Setting background color as a gradient centered with yellow in the middle
        Stop[] stops = new Stop[]{new Stop(0, Color.web("#c0dbad")), new Stop(1, Color.web("#fcf1cb"))};
        LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        borderPane.setBackground(new javafx.scene.layout.Background(new javafx.scene.layout.BackgroundFill(gradient, null, null)));

        // Setting the Scene to the Stage
        logInStage.setScene(scene);
        logInStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
