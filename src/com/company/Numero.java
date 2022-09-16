package com.company;

public class Numero {

    public String variable;
    public double numeroTransformado;
    public Numero(String variable) {
        this.variable=variable;
    }

    public double transformarADecimal(Numero numero) {

        Binario numeroBinario = new Binario(variable);
        Romano numeroRomano = new Romano(variable);
        double numeroTransformado=0;

        if(numero instanceof Binario){
            numeroTransformado=numeroBinario.transformacionBinarioADecimal(variable);
        }

        if(numero instanceof Romano){
            numeroTransformado=numeroRomano.transformacionRomanoADecimal(variable);
        }
        System.out.println(numero.getClass());
        return numeroTransformado;
    }
}
