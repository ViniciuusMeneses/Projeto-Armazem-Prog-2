module com.example.projeto_armazem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projeto_armazem to javafx.fxml;
    exports com.example.projeto_armazem;
}