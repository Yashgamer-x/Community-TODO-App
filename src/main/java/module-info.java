module org.yashgamer.communitytodoapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens org.yashgamer.communitytodoapp to javafx.fxml;
    exports org.yashgamer.communitytodoapp;
}