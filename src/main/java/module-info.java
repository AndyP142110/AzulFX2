module com.example.azulfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;



    opens com.example.azulfx to javafx.fxml;
    exports com.example.azulfx;
}