package com.meli_exexceptions;

public class AplicationExMeli {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Verificada e) {
            System.out.println("Pegou a execao verificada " + e.getMessage());
        }
    }

    public static void metodo1() throws Verificada {
        throw new Verificada("Ërro no metodo1");
    }

    public static void metodo2() throws Verificada {
        metodo1();
    }

    static class Verificada extends Exception{
        public Verificada(String mensagem){
            super(mensagem);
        }
    }
}

