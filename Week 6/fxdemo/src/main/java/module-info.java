module com.example.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.fxdemo to javafx.fxml;
    exports com.example.fxdemo;
}