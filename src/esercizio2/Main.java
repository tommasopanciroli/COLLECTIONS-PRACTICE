package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = listaOrdinata(6, 7, 5, 8, 10, 1, 101);
        System.out.println("Lista ordinata: " + lista);

        List<Integer> listaInversa = listaInvertita(lista);
        System.out.println("Lista invertita: " + listaInversa);

        List<Integer> listaPariODispari = new ArrayList<>(lista);
        listaPariDispari(listaPariODispari, true);
    }

    public static List<Integer> listaOrdinata(int... numeri) {
        List<Integer> listaNumeri = new ArrayList<>();
        for (int numero : numeri) {
            if (numero <= 100) {
                listaNumeri.add(numero);
            } else {
                System.out.println(numero + " ignorato perché maggiore di 100.");
            }
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