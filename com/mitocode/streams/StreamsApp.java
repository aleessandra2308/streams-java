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
        //
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
        numeros.stream().map(x -> Integer.parseInt(x) +1).forEach(System.out::println);
    }

    public void limitar() {
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar() {
        long x = lista.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        //app.filtrar();
       //sapp.ordenar();
       //app.transformar();
       //app.limitar();
       app.contar();
    }
}