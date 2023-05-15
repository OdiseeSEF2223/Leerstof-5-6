module com.example.openingnewwindows {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.openingnewwindows to javafx.fxml;
    exports com.example.openingnewwindows;
}