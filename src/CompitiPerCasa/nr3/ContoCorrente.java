package CompitiPerCasa.nr3;

public class ContoCorrente {
    protected double saldo = 100;
    protected int movimenti = 0;

    public void preleva(double importo) throws BancaException {
        if (saldo - importo < 0) {
            movimenti++;
            throw new BancaException("Il conto è in rosso");
        }
        saldo -= importo;
    }
}
