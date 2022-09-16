package com.company;

public class Calculadora {
    public Calculadora() {
    }

    public double sumar(Numero num_1, Numero num_2) {
        double resultado=num_1.transformarADecimal(num_1)+num_2.transformarADecimal(num_2);
        return resultado;
    }
}
