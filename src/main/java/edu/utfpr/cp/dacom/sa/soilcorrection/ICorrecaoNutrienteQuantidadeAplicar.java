package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.NonNull;

public interface ICorrecaoNutrienteQuantidadeAplicar<T extends IFonteNutriente> {
    
    public default double calculaQuantidadeAplicar(
        @NonNull double necessidade,
        T fonteNutriente) {

        if (necessidade <= 0) {
            throw new IllegalArgumentException();
        }

        return necessidade / fonteNutriente.getTeorFonte();
    }
}
