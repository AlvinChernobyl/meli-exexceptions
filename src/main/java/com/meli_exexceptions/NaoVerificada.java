package com.meli_exexceptions;

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

