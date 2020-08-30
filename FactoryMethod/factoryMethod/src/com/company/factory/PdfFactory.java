package com.company.factory;

import com.company.model.IFormato;
import com.company.model.Pdf;

public class PdfFactory extends FormatoFactory {
    @Override
    public IFormato crearFormato() {
        IFormato pdf = new Pdf();
        return pdf;
    }
}
