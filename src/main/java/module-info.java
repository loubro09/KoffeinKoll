module KoffeinKoll {
    requires javafx.controls;
    requires javafx.fxml;


    opens KoffeinKoll to javafx.fxml;
    exports KoffeinKoll;
}