module com.example.loginwindow {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.loginwindow to javafx.fxml;
    exports com.example.loginwindow;
}