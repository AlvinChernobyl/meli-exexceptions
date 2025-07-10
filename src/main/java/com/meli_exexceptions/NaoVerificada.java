package com.meli_exexceptions;

import static com.meli_exexceptions.AplicationExMeli.metodo1;
import static com.meli_exexceptions.AplicationExMeli.metodo2;

public class NaoVerificada {

    public static void main(String[] args) {
        metodo2();
    }

    public static void metodo1() {
        throw new MinhaExecaoNaoChecada("erro no metodo1");
    }
    public static void metodo2() {
        metodo1();
    }
}

class MinhaExecaoNaoChecada extends RuntimeException {
    public MinhaExecaoNaoChecada(String mensagem) {
        super(mensagem);
    }
}

