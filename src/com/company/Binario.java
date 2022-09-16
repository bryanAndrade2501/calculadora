package com.company;

public class Binario extends Numero {
    public Binario(String variable) {
        super(variable);
    }

    public double transformacionBinarioADecimal(String variable){

        double numeroTransformado = 0;
        int posicion = 0;
        for (int x = variable.length() - 1; x >= 0; x--) {
            short digito = 1;
            if (variable.charAt(x) == '0') {
                digito = 0;
            }

            double multiplicador = Math.pow(2, posicion);
            numeroTransformado += digito * multiplicador;
            posicion++;
        }
        return numeroTransformado;

    }

}

