package edu.utfpr.cp.dacom.sa.soilcorrection.fonte;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutriente.NomeNutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutriente.NutrienteAdicional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum FonteFosforo implements IFonteNutriente {
    SUPERFOSFATO_SIMPLES(0.18, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.1), new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.28))),
    SUPERFOSFATO_TRIPO(0.41, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.2))),
    MAP(0.48, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.09)));

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;
}
