package br.com.elevador.test;

import br.com.elevador.main.Elevador.Elevador;
import br.com.elevador.main.ElevadorExercicio;

public class Test {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 10);

        elevador.sobe(3);

        System.out.println(elevador.getAndarAtual());


    }

}
