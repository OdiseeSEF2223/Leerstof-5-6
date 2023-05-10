module com.example.geheledeling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.geheledeling to javafx.fxml;
    exports com.example.geheledeling;
}