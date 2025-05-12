package CompitiPerCasa.nr3;

public class ProvaEs3 {
    public static void main(String[] args) {
        ContoOnline conto = new ContoOnline();

        double[] prelievi = {30, 60, 20, 120, 10};

        for (double p : prelievi) {
            try {
                conto.preleva(p);
                System.out.println("Prelievo di " + p + " effettuato. Saldo attuale: " + conto.saldo);
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }
    }
}
