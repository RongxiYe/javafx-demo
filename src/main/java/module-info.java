module com.example.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires gson;
    requires java.sql;

    opens com.example.javafxdemo to javafx.fxml;
    exports com.example.javafxdemo;
    exports com.example.javafxdemo.controller.login;
    opens com.example.javafxdemo.controller.login to javafx.fxml;
    exports com.example.javafxdemo.controller.user;
    opens com.example.javafxdemo.controller.user to javafx.fxml;
    opens com.example.javafxdemo.controller to javafx.fxml;
    exports com.example.javafxdemo.controller;

//    opens com.example.javafxdemo.test to javafx.graphics;
//    exports com.example.javafxdemo.test;

    exports com.example.javafxdemo.data;

    opens com.example.javafxdemo.data to gson;
}