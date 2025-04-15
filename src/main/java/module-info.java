module com.example.fxdice2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxdice2 to javafx.fxml;
    exports com.example.fxdice2;
}