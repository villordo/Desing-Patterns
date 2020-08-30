package com.company.factory;

import com.company.model.IFormato;
import com.company.model.Word;

public class WordFactory extends FormatoFactory {
    @Override
    public IFormato crearFormato() {
        IFormato word = new Word();
        return word;
    }
}
