package com.company.model;

public class Word implements IFormato {
    @Override
    public void abrir() {
        System.out.println("Abro archivo con formato Word");
    }

    @Override
    public void cerrar() {
        System.out.println("Cierro archivo con formato Word");
    }

    @Override
    public void grabar() {
        System.out.println("Grabo archivo con formato Word");
    }
}
