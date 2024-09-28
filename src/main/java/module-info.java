module com.book.shop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;

    opens com.book.shop to javafx.fxml;
    exports com.book.shop;
}
