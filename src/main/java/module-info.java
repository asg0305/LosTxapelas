module com.example.lostxapelas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lostxapelas to javafx.fxml;
    exports com.example.lostxapelas;
}