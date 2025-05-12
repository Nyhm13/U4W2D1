package ProvaStatic;

public class Counter {

    // dando alla variabile contatore trasforma la variabile di istanza in una variabile di classe.
    // ora il valore della variabile contatore sarà non sarà piu indipendente da oggetto ad oggetto
    // ma sarà comune a tutti gli oggetti di quella classe.
    // quindi adesso nella prova counter dove abbiamo creato 2 oggetti  il contatore aumenta di 1 per ogni oggetto
    // partendo dal valore del ultimo oggetto quindi ad ogni oggetto creato il contatore aumenta di 1

    private static int contatore;

    // costruttore  che quando verra chiamato per creare un oggetto andrà ad incrementare la variabile contatore
    public Counter(){
        contatore++;
    }
    /*un metodo static è un metodo che può essere richiamato senza dover creare un
    oggetto della classe, ma il metodo può essere richiamato direttamente usando
    il nome della classe.metodo

     */
    public static int getContatore(){
        return contatore;
    }
}
