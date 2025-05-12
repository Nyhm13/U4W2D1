package CompitiPerCasa.nr3;

class ContoOnline extends ContoCorrente {
    private double maxPrelievo = 50;

    @Override
    public void preleva(double importo) throws BancaException {
        if (importo > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
        super.preleva(importo);
    }
}