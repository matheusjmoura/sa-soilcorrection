package edu.utfpr.cp.dacom.sa.soilcorrection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static edu.utfpr.cp.dacom.sa.soilcorrection.TexturaSolo.ARGILOSO;
import static edu.utfpr.cp.dacom.sa.soilcorrection.TexturaSolo.TEXTURA_MEDIA;

public class CorrecaoCalcioMagnesio implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public List<Double> idealCTCCalcio(TexturaSolo solo) {
        if (solo.equals(ARGILOSO)) {
            return Arrays.asList(45.0, 55.0);
        } else if (solo.equals(TEXTURA_MEDIA)) {
            return Arrays.asList(35.0, 40.0);
        }

        return Collections.emptyList();
    }

    public List<Double> idealCTCMagnesio(TexturaSolo solo) {
        if (solo.equals(ARGILOSO)) {
            return Arrays.asList(10.0, 15.0);
        } else if (solo.equals(TEXTURA_MEDIA)) {
            return Arrays.asList(8.0, 12.0);
        }

        return Collections.emptyList();
    }

    public double calculaCalcioAdicionado(double teor){
        return 0.01783 * teor;
    }

    public double calculaQuantidadeAplicar(double teorCalcio, double prnt) {
        if (teorCalcio <= 0) {
            throw new IllegalArgumentException();
        }
        return teorCalcio / prnt;
    }

    public double calculaTeorCalcio(double teorSolo, double participacaoCTCExistente, double participacaoCTCDesejada,
                                    double teorCalcioFosfagem) {
        if (teorSolo <= 0 || participacaoCTCExistente <= 0 || participacaoCTCDesejada <= 0) {
            throw new IllegalArgumentException();
        }

        return (teorSolo * participacaoCTCDesejada / participacaoCTCExistente) - teorSolo - teorCalcioFosfagem;
    }
}