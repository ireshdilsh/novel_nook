module com.book.shop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;
    requires java.sql;

    opens com.book.shop to javafx.fxml;
    exports com.book.shop;
}
