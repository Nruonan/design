package strategy;

/**
 * @author Nruonan
 * @description
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double cash) {
        return cash;
    }
}
