package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestaCorrecaoCalcioMagnesio {

    @Test
    void testaQuantidadeAplicar() {

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        var necessidade = 130;
        var prnt = 70;

        assertEquals(1.8571428571428572, correcaoCalcioMagnesio.calculaQuantidadeAplicar(necessidade, prnt));
    }

    @Test
    void testaCustoReaisHa() {

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        var qtdeMagnesioAplicar = 1.85;

        assertEquals(0.925, correcaoCalcioMagnesio.calculaCusto(500.0, qtdeMagnesioAplicar));
    }

    @Test
    void testaNutrientesAdicionais() {

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        var qtdeCalcioMagnesioAplicar = 1.85;

        assertEquals(1, correcaoCalcioMagnesio.getNutrientesAdicionais(qtdeCalcioMagnesioAplicar,
            FonteCalcioMagnesio.GESSO_AGRICOLA).size());
    }

    @Test
    void testaCalcioAdicionado(){

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        assertEquals(0.5170699999999999, correcaoCalcioMagnesio.calculaCalcioAdicionado(29));
    }

    @Test
    void testaTeorCalcioAdicionar(){

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        assertEquals(1.312232656177782, correcaoCalcioMagnesio.calculaTeorCalcio(5.76,
            44.6858029480217, 55.0, 0.017267343822222));
    }
}