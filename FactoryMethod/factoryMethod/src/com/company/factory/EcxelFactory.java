package com.company.factory;

import com.company.model.Ecxel;
import com.company.model.IFormato;

public class EcxelFactory extends FormatoFactory {
    @Override
    public IFormato crearFormato() {
        IFormato ecxel = new Ecxel();
        return ecxel;
    }
}
