module org.example.caso1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.caso1 to javafx.fxml;
    exports org.example.caso1;
}