module com.example.hm4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hm4 to javafx.fxml;
    exports com.example.hm4;
}