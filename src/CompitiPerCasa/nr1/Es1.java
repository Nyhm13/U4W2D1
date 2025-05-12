package CompitiPerCasa.nr1;

import java.util.Random;
import java.util.Scanner;
/*

Esercizio #1

Scrivere un programma che istanzi un array di 5 interi con valori casuali tra 1 e 10 e lo stampi in console,
chieda poi all'utente di inserire un numero in una posizione specificata e stampi il nuovo stato dell'array,
ripetere l'operazione fino a che l'utente non inserisce il valore 0.
Gestire eventuali errori dovuti alla violazione dei limiti dell'array.
 (Extra: Provare ad usare LogBack per stampare i messaggi di errore)
*/
public class Es1 {
    public static void main(String[] args) {

        // instanzo un array di 5 interi
        int [] arrayNumeri = new int[5];

        Random numeriRandom= new Random();

        Scanner scanner = new Scanner(System.in);
        // popolo l`array numeri con numeri casuali
        for (int i = 0; i < arrayNumeri.length ; i++) {
            arrayNumeri[i]= numeriRandom.nextInt(10)+1;

        }

        stampaArray(arrayNumeri);

        while (true){
            try {
                //chiedl al utente di darmi un numero da inserire nel array al posto di un altro numero
                System.out.println("Inserici un numero (0 per uscire)");
                int numeroUtente= scanner.nextInt();
                // se il numero inserito è 0 il programma si interrompe
                if (numeroUtente==0) break;
                //chiedo al utente di darmi un numero per la posizione
                System.out.println("Inserisci la posizione (0-4):");
                int posizione = scanner.nextInt();

                arrayNumeri[posizione] = numeroUtente;
                stampaArray(arrayNumeri);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Errore: posizione fuori dall'array!");
                System.out.println(e.getMessage());
            }
        }


    }

     public static  void stampaArray (int[] array){
        for (int numero : array) {
            System.out.println(numero+" ");

        }

    }
}
