module com.oop.finalproject.largefoodcourtoperations {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.finalproject.largefoodcourtoperations to javafx.fxml;
    exports com.oop.finalproject.largefoodcourtoperations;
}