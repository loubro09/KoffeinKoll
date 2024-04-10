package KoffeinKoll.View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LogInPage extends Application {

    private Stage logInStage;

    @Override
    public void start(Stage stage) throws Exception {
        this.logInStage =logInStage;
        logInStage.setTitle("KoffeinKoll - Caffeine Management Tool");
        logInStage.setWidth(800);
        logInStage.setHeight(800);

        Label titleLabel = new Label("KoffeinKoll");
        titleLabel.setFont(Font.font("Dialog", 46));

        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20));



        Scene scene = new Scene(borderPane, 800, 800);

        // Setting background color as a gradient centered with yellow in the middle
        Stop[] stops = new Stop[]{new Stop(0, Color.web("#c0dbad")), new Stop(1, Color.web("#fcf1cb"))};
        LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        borderPane.setBackground(new javafx.scene.layout.Background(new javafx.scene.layout.BackgroundFill(gradient, null, null)));

        // Setting the Scene to the Stage
        logInStage.setScene(scene);

        logInStage.show();
    }
}
