module com.empresa.crudmongo017 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.crudmongo017 to javafx.fxml;
    exports com.empresa.crudmongo017;
}