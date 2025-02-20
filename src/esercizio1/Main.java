package esercizio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> paroleUniche = new HashSet();
        List<String> paroleDuplicate = new ArrayList<>();
        System.out.println("Inserisci un numero per indicare quanti elementi ci saranno nel set");
        int n = 0;

        try {
            n = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Errore: Devi inserire un numero intero!");
            scanner.close();
            return;
        }

        int count = 0;
        while (count < n) {
            System.out.println("Inserisci una parola");
            String parola = scanner.nextLine();
            if (!paroleUniche.add(parola)) {
                paroleDuplicate.add(parola);
            }
            count++;
        }
        System.out.println("Le parole duplicate: " + paroleDuplicate);
        System.out.println("Le parole uniche: " + paroleUniche);
        System.out.println("Il numero di parole uniche: " + paroleUniche.size());

        scanner.close();
    }
}