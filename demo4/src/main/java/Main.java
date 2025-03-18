/**
 * @author Nruonan
 * @description
 */
public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl("小红");
        Proxy pursuit = new Proxy(girl);

        pursuit.giveMoney();
        pursuit.giveFlowers();
        pursuit.giveDoll();

    }
}
