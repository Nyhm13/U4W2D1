package CompitiPerCasa.nr2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Esercizio #2
Scrivere un programma che permetta di calcolare il numero di km/litro percorsi da un'auto.
*  Il programma riceve dall'utente il numero di km percorsi ed i litri di carburante consumati e stampa i km/litro percorsi.
*  Gestire per mezzo del try-catch l'eventualità che l'utente inserisca il valore 0 per il numero di litri consumati \
* e venga generata una eccezione di divisione per zero. Provare sia ad utilizzare interi sia double per capire come si comportino.
 (Extra: Provare ad usare LogBack per stampare i messaggi di errore)*/
public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci km percorsi:");
            double km = scanner.nextDouble();

            System.out.println("Inserisci litri consumati:");
            double litri = scanner.nextDouble();

            double consumo = calcolaKmPerLitro(km, litri);
            System.out.println("Il tuo Consumo e di: " + consumo + " km/l");

        } catch (ArithmeticException e) {
            System.out.println("Errore:"+ e.getMessage());

        }catch (InputMismatchException e){
            System.out.println("cado malato");
        }
        catch (Exception e) {
            System.out.println("Errore generico: " + e.getMessage());
        }
    }

    // Metodo dedicato per il calcolo
    public static double calcolaKmPerLitro (double km, double litri) {
        if (litri == 0) {
            throw new ArithmeticException("Non si può dividere per zero");
        }
        return km / litri;
    }
}