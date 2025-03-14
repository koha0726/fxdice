module com.example.fxdice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxdice to javafx.fxml;
    exports com.example.fxdice;
}