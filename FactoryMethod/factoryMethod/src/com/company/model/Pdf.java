package com.company.model;

public class Pdf implements IFormato {
    @Override
    public void abrir() {
        System.out.println("Abro archivo con formato PDF");
    }

    @Override
    public void cerrar() {
        System.out.println("Cierro archivo con formato PDF");
    }

    @Override
    public void grabar() {
        System.out.println("Grabo archivo con formato PDF");
    }
}
