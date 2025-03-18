/**
 * @author Nruonan
 * @description 代理类
 */
public class Proxy implements Gift{
    Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDoll() {
        pursuit.giveDoll();
    }

    @Override
    public void giveMoney() {
        pursuit.giveMoney();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }
}
