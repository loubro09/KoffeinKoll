module com.example.koffeinkoll {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.koffeinkoll to javafx.fxml;
    exports com.example.koffeinkoll;
}