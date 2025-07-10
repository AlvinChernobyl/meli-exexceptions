package com.meli_exexceptions;

public class TryCatchErro {

    public static void main(String[] args) {
        try {
            System.out.println("Inicio");
            String i = null;
            i.length();
            System.out.println("Fim Try");
        } catch (Exception e) {
            System.out.println("Catch erro - " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Fim");
        }
    }
}
