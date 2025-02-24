package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = listaOrdinata(6);
        System.out.println("Lista ordinata: " + lista);

        List<Integer> listaInversa = listaInvertita(lista);
        System.out.println("Lista invertita: " + listaInversa);

        List<Integer> listaPariODispari = new ArrayList<>(lista);
        listaPariDispari(listaPariODispari, true);
    }

    public static List<Integer> listaOrdinata(int N) {
        List<Integer> listaNumeri = new ArrayList<>();
        int numero;
        for (int i = 0; i < N; i++) {
            numero = (int) (Math.random() * 101) + 1;
            listaNumeri.add(numero);
        }
        Collections.sort(listaNumeri);
        return listaNumeri;
    }

    public static List<Integer> listaInvertita(List<Integer> lista) {
        List<Integer> listaInversa = new ArrayList<>(lista);
        Collections.reverse(listaInversa);
        return listaInversa;
    }

    public static void listaPariDispari(List<Integer> lista, boolean booleano) {
        for (int i = 0; i < lista.size(); i++) {
            if ((booleano && i % 2 == 0) || (!booleano && i % 2 != 0)) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            }
        }
    }
}