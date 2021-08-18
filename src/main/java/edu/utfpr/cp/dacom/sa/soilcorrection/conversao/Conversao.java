package edu.utfpr.cp.dacom.sa.soilcorrection.conversao;

public interface Conversao<T, R> {

    public R converte(T valor);
}
