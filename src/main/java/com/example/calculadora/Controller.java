package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    private Label pantalla;
    private boolean comenzar=true;
    private Model model = new Model();

    public Controller(Label ventana) {
        this.pantalla = ventana;
    }

        public void manejaBoton(ActionEvent e){
            pantalla.setText(pantalla.getText()+((Button)e.getSource()).getText());
        }

        public void manejaBotonC(ActionEvent e){
        pantalla.setText("0");
        }

        public void manejaBotonOp(ActionEvent e){
        if (((Button)e.getSource()).getText()=="="){
            model.setNum2(Float.parseFloat(pantalla.getText()));
            pantalla.setText(String.valueOf(model.calcular()));
        }else{
            model.setNum1(Float.parseFloat(pantalla.getText()));
            model.setOperador(((Button)e.getSource()).getText());
            pantalla.setText("");
        }
        }
    }

