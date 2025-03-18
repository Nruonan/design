import strategy.CashNormal;
import strategy.CashRebate;
import strategy.CashReturn;
import strategy.CashSuper;

/**
 * @author Nruonan
 * @description 引用上下文策略
 */
public class CashContext {
    CashSuper cashSuper;
    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn(300,100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double cash) {
        return cashSuper.acceptCash(cash);
    }
}
