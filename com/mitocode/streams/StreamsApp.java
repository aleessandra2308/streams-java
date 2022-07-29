package com.mitocode.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {
    private List<String> lista;
    private List<String> numeros;

    public StreamsApp() {
        lista = new ArrayList<>();
        lista.add("Ales");
        lista.add("Code");
        lista.add("Daniela");
        lista.add("AlessCode");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    public void filtrar() {
        lista.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
    }

    public void ordenar() {
        //Ascendente
        lista.stream().sorted().forEach(System.out::println);
        //Descendente
        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar() {

    }

    public void limitar() {

    }

    public void contar() {

    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        //app.filtrar();
        app.ordenar();
    }
}