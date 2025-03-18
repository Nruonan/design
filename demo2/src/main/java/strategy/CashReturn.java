package strategy;

public class CashReturn extends CashSuper {
    double all_money;
    double money;

    public CashReturn(double all_money, double money) {
        this.all_money = all_money;
        this.money = money;
    }

    @Override
    public double acceptCash(double cash) {
        double res = cash;
        while (cash >= all_money){
            res -= money;
            cash -= all_money;
        }
        return res;
    }
}