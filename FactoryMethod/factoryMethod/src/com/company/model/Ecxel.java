package com.company.model;

public class Ecxel implements IFormato {
    @Override
    public void abrir() {
        System.out.println("Abro archivo con formato Ecxel");
    }

    @Override
    public void cerrar() {
        System.out.println("Cierro archivo con formato Ecxel");
    }

    @Override
    public void grabar() {
        System.out.println("Grabo archivo con formato Ecxel");
    }
}
