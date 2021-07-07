package edu.utfpr.cp.dacom.sa.soilcorrection;

import static edu.utfpr.cp.dacom.sa.soilcorrection.TexturaSolo.ARGILOSO;
import static edu.utfpr.cp.dacom.sa.soilcorrection.TexturaSolo.TEXTURA_MEDIA;

public class CorrecaoCalcioMagnesio implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public String idealCTCCalcio(TexturaSolo solo) {
        String concentracaoIdealCalcio = "";

        if (solo.equals(ARGILOSO)) {
            concentracaoIdealCalcio = "45 a 55";
        } else if (solo.equals(TEXTURA_MEDIA)) {
            concentracaoIdealCalcio = "35 a 40";
        }

        return concentracaoIdealCalcio;
    }

    public String idealCTCMagnesio(TexturaSolo solo) {
        String concentracaoIdealMagnesio = "";

        if (solo.equals(ARGILOSO)) {
            concentracaoIdealMagnesio = "10 a 15";
        } else if (solo.equals(TEXTURA_MEDIA)) {
            concentracaoIdealMagnesio = "8 a 12";
        }

        return concentracaoIdealMagnesio;
    }
}