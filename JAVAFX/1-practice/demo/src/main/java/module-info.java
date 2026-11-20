module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.example to javafx.fxml;
    opens com.example._controllers to javafx.fxml;
    opens com.example._models to javafx.fxml;
    exports com.example;
    exports com.example._models;
}
