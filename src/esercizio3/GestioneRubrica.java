package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class GestioneRubrica {
    public static void main(String[] args) {
        Map<String, Integer> rubrica = new HashMap<>();
        inserimentoInRubrica(rubrica, "Tommaso", 333444555);
        inserimentoInRubrica(rubrica, "Valentina", 333454578);
        inserimentoInRubrica(rubrica, "Francois", 333432175);
        inserimentoInRubrica(rubrica, "Anna", 323474895);
        System.out.println(rubrica);
        System.out.println("Eliminato contatto tramite nome.");
        cancellaContatto(rubrica, "Tommaso");
        System.out.println(rubrica);
        ricercaConNumero(rubrica, 333454578);
        System.out.println(rubrica);

    }

    public static void inserimentoInRubrica(Map<String, Integer> rubrica, String nome, int numero) {
        rubrica.put(nome, numero);
    }

    public static void cancellaContatto(Map<String, Integer> rubrica, String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
        }
    }

    public static void ricercaConNumero(Map<String, Integer> rubrica, int numeroDiTelefono) {
        boolean trovato = false;
        for (Map.Entry<String, Integer> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numeroDiTelefono)) {
                System.out.println("Il numero è di: " + entry.getKey() + ".");
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Numero non trovato nella rubrica.");
        }
    }

    public static void ricercaConNome(HashMap<String, Integer> rubrica, String nome){
        System.out.println("Il numero di telefono di " + nome + "è: " + rubrica.get(nome) + ".");
    }
}
