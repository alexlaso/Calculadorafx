package com.example.calculadora;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Vista extends VBox{
    private Label ventana= new Label();
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnMas, btnMenos, btnIgual, btnMulti, btnDiv, btnComa, btnReset;
    private Controller controlador;

    public Vista() {
        initVista();
        controlador = new Controller(ventana);
        btn0.setOnAction(e->controlador.manejaBoton(e));
        btn1.setOnAction(e->controlador.manejaBoton(e));
        btn2.setOnAction(e->controlador.manejaBoton(e));
        btn3.setOnAction(e->controlador.manejaBoton(e));
        btn4.setOnAction(e->controlador.manejaBoton(e));
        btn5.setOnAction(e->controlador.manejaBoton(e));
        btn6.setOnAction(e->controlador.manejaBoton(e));
        btn7.setOnAction(e->controlador.manejaBoton(e));
        btn8.setOnAction(e->controlador.manejaBoton(e));
        btn9.setOnAction(e->controlador.manejaBoton(e));
        btnComa.setOnAction(e->controlador.manejaBoton(e));

        btnMenos.setOnAction(e->controlador.manejaBotonOp(e));
        btnMas.setOnAction(e->controlador.manejaBotonOp(e));
        btnMulti.setOnAction(e->controlador.manejaBotonOp(e));
        btnDiv.setOnAction(e->controlador.manejaBotonOp(e));
        btnIgual.setOnAction(e->controlador.manejaBotonOp(e));

        btnReset.setOnAction(e->controlador.manejaBotonC(e));
}

    private void initVista() {
        ventana.setAlignment(Pos.CENTER);
        ventana.setFont(new Font(20));
        ventana.setPrefSize(60,40);
        ventana.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        ventana.setText("");

        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnMas = new Button("+");
        btnMenos = new Button("-");
        btnMenos.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnMulti = new Button("*");
        btnDiv = new Button("/");
        btnComa = new Button(".");
        btnComa.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnIgual = new Button("=");
        btnReset = new Button("C");

        GridPane panel = new GridPane();

        panel.add(btn1, 1, 3);
        panel.add(btn2, 2, 3);
        panel.add(btn3, 3, 3);
        panel.add(btn4, 1, 2);
        panel.add(btn5, 2, 2);
        panel.add(btn6, 3, 2);
        panel.add(btn7, 1, 1);
        panel.add(btn8, 2, 1);
        panel.add(btn9, 3, 1);
        panel.add(btn0, 1, 4);
        panel.add(btnMas, 4, 1);
        panel.add(btnMenos, 4, 2);
        panel.add(btnIgual, 4, 3, 2, 2);
        btnIgual.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        panel.add(btnMulti, 5, 1);
        panel.add(btnDiv, 5, 2);
        panel.add(btnReset, 3, 4);
        panel.add(btnComa, 2, 4);

        //panel.getChildren().forEach(e ->);

        this.getChildren().add(ventana);
        this.getChildren().add(panel);
    }


}
