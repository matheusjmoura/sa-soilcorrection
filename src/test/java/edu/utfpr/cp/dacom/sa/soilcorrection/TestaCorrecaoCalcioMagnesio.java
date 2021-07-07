package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestaCorrecaoCalcioMagnesio {

    @Test
    void testaQuantidadeAplicar() {

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        var necessidadeMagnesio = 6.25;

        assertEquals(1850.0, correcaoCalcioMagnesio.calculaQuantidadeAplicar(necessidadeMagnesio,
            FonteCalcioMagnesio.CALCARIO_CALCITICO));
    }

    @Test
    void testaCustoReaisHa() {

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        var qtdeMagnesioAplicar = 6.25;

        assertEquals(922.68, correcaoCalcioMagnesio.calculaCusto(500.0, qtdeMagnesioAplicar));
    }

}