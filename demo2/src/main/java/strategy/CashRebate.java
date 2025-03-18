package strategy;

/**
 * @author Nruonan
 * @description
 */
public class CashRebate extends CashSuper {
    double rate;

    public CashRebate(double rate) {
        this.rate = rate;
    }

    @Override
    public double acceptCash(double cash) {
        return cash * rate;
    }

}
