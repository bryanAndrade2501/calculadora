package com.company;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora();

        double resultado = calculadora1.sumar(new Romano("X"), new Binario("101"));
        System.out.println(resultado);


        String numero;
        numero = convertirDecimalABinarioManual(20);
        System.out.println(numero);
    }

    public static String convertirDecimalABinarioManual(long decimal) {
        
    }
}
