package com.example.calculadora;

public class Model {
    private float num1, num2;
    private String operador;

    public void setNum1(float num1){
        this.num1=num1;
    }

    public void setNum2(float num2){
        this.num2=num2;
    }

    public void setOperador(String operador){
        this.operador=operador;
    }

    public float calcular(){
        switch (operador){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case"/":
                return num1/num2;
            case"*":
                return num1*num2;
            default:
                return 0;
        }
    }
}
