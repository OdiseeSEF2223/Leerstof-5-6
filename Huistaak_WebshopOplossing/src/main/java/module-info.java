module com.example.huistaak_webshop {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.huistaak_webshop to javafx.fxml;
    exports com.example.huistaak_webshop;
}