package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum FontePotassio implements IFonteNutriente {
    CLORETO_POTASSIO(0.58, Set.of()),
    SULFATO_POTASSIO(0.52, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.17))),
    SULFATO_POTASSIO_MAGNESIO(0.22, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.22), new NutrienteAdicional(NomeNutrienteAdicional.MAGNESIO, 0.18)));

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;
}
