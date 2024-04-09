package KoffeinKoll;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HomePage extends Application{

        private Stage primaryStage;

        @Override
        public void start(Stage primaryStage) {
            this.primaryStage = primaryStage;
            primaryStage.setTitle("KoffeinKoll - Caffeine Management Tool");
            primaryStage.setWidth(800);
            primaryStage.setHeight(800);

            // Creating labels
            Label titleLabel = new Label("KoffeinKoll");
            titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 46));
            titleLabel.setTextFill(Color.rgb(0, 70, 0));


            // Creating buttons
            Button accountButton = new Button("Statistics");
            Button statisticsButton = new Button("Profile");
            Button infoButton = new Button("Info");
            Button logoutButton = new Button("Logout");

            // Apply styles to buttons
            accountButton.setStyle("-fx-background-color: #004600; -fx-text-fill: #c2ffc2; -fx-font-size: 20px; -fx-min-width: 150px; -fx-min-height: 50px;");
            statisticsButton.setStyle("-fx-background-color: #e4ffe4; -fx-text-fill: #004600; -fx-font-size: 20px; -fx-min-width: 150px; -fx-min-height: 50px;");
            infoButton.setStyle("-fx-background-color: #e4ffe4; -fx-text-fill: #004600; -fx-font-size: 20px; -fx-min-width: 150px; -fx-min-height: 50px;");
            logoutButton.setStyle("-fx-background-color: #e4ffe4; -fx-text-fill: #004600; -fx-font-size: 20px; -fx-min-width: 150px; -fx-min-height: 50px;");



            // Creating a BorderPane layout for main page
            BorderPane borderPane = new BorderPane();
            borderPane.setPadding(new Insets(20));

            // Creating a HBox for buttons
            HBox buttonHBox = new HBox(40);
            buttonHBox.setAlignment(Pos.CENTER);
            buttonHBox.getChildren().addAll(accountButton, statisticsButton, infoButton, logoutButton);
            borderPane.setBottom(buttonHBox);

            // Apply style to button panel
            buttonHBox.setStyle("-fx-background-color: #004600; -fx-padding: 20px;");
           // BorderPane.setAlignment(buttonHBox, Pos.CENTER);

            // Creating an Arc for caffeine intake display
            Arc arc = new Arc(100, 100, 80, 80, 90, 0);
            arc.setType(ArcType.OPEN);
            arc.setStroke(Color.DARKGREEN);
            arc.setStrokeWidth(10);
            arc.setFill(null);
            borderPane.setCenter(arc);

            // Creating a VBox for main page
            HBox topHBox = new HBox();
            topHBox.getChildren().add(titleLabel);
            topHBox.setAlignment(Pos.CENTER);
            borderPane.setTop(topHBox);

            // Skapa knappen för "Log Beverage"
            Button logBeverageButton = new Button("Log Beverage");

            // Tillämpa stil på knappen
            logBeverageButton.setStyle("-fx-background-color: #004600; -fx-text-fill: #c2ffc2; -fx-font-size: 20px; -fx-min-width: 150px; -fx-min-height: 50px;");

            // Skapa en HBox för "Log Beverage" knappen
            HBox logBeverageButtonHBox = new HBox(logBeverageButton);
            logBeverageButtonHBox.setAlignment(Pos.CENTER);
            logBeverageButtonHBox.setSpacing(20);


            // Skapa en ny VBox för att innehålla den nya "Log Beverage" knappen och den befintliga knappanelen
            VBox combinedButtonVBox = new VBox();
            combinedButtonVBox.setAlignment(Pos.CENTER);
            combinedButtonVBox.setSpacing(100);
            combinedButtonVBox.getChildren().addAll(logBeverageButtonHBox, buttonHBox);

            // Placera den kombinerade VBox i BorderPane, men placera den i botten
            borderPane.setBottom(combinedButtonVBox);



            // Creating a Scene and adding the BorderPane to it
            Scene scene = new Scene(borderPane, 800, 800);

            // Setting background color as a gradient centered with yellow in the middle
            Stop[] stops = new Stop[]{new Stop(0, Color.web("#c0dbad")), new Stop(1, Color.web("#fcf1cb"))};
            LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
            borderPane.setBackground(new javafx.scene.layout.Background(new javafx.scene.layout.BackgroundFill(gradient, null, null)));

            // Setting the Scene to the Stage
            primaryStage.setScene(scene);

            // Set action for logout button
            logoutButton.setOnAction(e -> {
                // Close current main window
                primaryStage.close();
                // Open login window
                //LoginWindow loginWindow = new LoginWindow();
                //loginWindow.start(new Stage());
            });

            // Displaying the Stage
            primaryStage.show();


        }



        public static void main(String[] args) {
            launch(args);
        }
    }
