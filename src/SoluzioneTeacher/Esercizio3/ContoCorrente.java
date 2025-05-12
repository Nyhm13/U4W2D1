package SoluzioneTeacher.Esercizio3;

public class ContoCorrente {
    protected String titolare;
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    //devo scrivere  throws BancaException nella firma del metodo per poter
    public void preleva(double x) throws BancaException{
        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;

        nMovimenti++;

        //dopo che ho fatto il prelievo faccio il controllo del saldo nel conto
        // se il  valore del saldo e inferiore a 0 mi faccio lanciare una nuova eccezione
        // questa eccezione e quella che mi sono creato da solo prima
        //ma non la voglio gestire qui dentro questa eccezione ma
        //  la voglio far gestire al main quindi devo aggiungere un throws BancaException nella firma del metodo preleva
        // facendo cosi dichiaro che chiunque chiami questo metodo nel main dovrà gestire questa eccezione
        // questa eccezione viene generata solo se il saldo è negativo
        if(saldo<0){
            throw new BancaException("il conto è in rosso");
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
