package SoluzioneTeacher.Esercizio3;


public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    // in quanto questa classe estende dalla sua superclasse ovvero ContoCorrente
    //anche essa si porta con se il metodo preleva dichiarato nella superclasse
    //solo che nell metodo preleva della superclasse abbiamo aggiunto l`eccezione BancaException
    //scrivo sempre throws BancaException per rilanciare questa eccezione facio cosi perche la voglio gestire nel main
    //QUESTO METODO PUO LANCIARE QUESTA ECCEZIONE PER DUE MOTIVI
    //1 PERCHE IL PRELIEVO SI PUO FARE MA CHIAMANDO IL METODO PRELEVA  DELLA SUPERCLASSE IL CONTO VA IN ROSSO
    // E ALLORA QUESTO METODO RIMANDA UN ECCEZIONE
    //2) PERCHE IL PRELIEVO NON SI PUO FARE PERCHE IL PRELIEVO SUPERA IL MAXPRELIEVO
    public void preleva(double x) throws BancaException{
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
        // faccio l`else cosi che se il  prelievo che voglio fare supera il maxprelievo
        //allora devo lanciare una eccezione di tipo BancaException
        else{
            throw new BancaException("prelievo non disponibile");
        }

    }
}