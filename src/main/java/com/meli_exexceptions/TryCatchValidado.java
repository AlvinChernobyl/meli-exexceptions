package com.meli_exexceptions;

public class TryCatchValidado {
    public static void main (String [] args) {
        try {
            System.out.println("Ïnicio");
            int x = 5;
            System.out.println("Fim do try");
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Fim");
        }
    }
}
