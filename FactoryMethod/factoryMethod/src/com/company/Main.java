package com.company;

import com.company.factory.EcxelFactory;
import com.company.factory.FormatoFactory;
import com.company.factory.PdfFactory;
import com.company.factory.WordFactory;
import com.company.model.IFormato;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FormatoFactory ecxelFactory = new EcxelFactory();
        FormatoFactory pdfFactory = new PdfFactory();
        FormatoFactory wordFactory = new WordFactory();

        IFormato ecxel = ecxelFactory.crearFormato();
        ecxel.abrir();
        ecxel.cerrar();
        ecxel.grabar();
        System.out.println("");
        IFormato word = wordFactory.crearFormato();
        word.abrir();
        word.cerrar();
        word.grabar();

    }
}
