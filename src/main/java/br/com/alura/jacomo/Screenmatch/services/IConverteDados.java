package br.com.alura.jacomo.Screenmatch.services;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}
