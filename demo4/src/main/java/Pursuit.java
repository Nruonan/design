/**
 * @author Nruonan
 * @description 追求者类
 */
public class Pursuit implements Gift{
    Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDoll() {
        System.out.println(girl.name + "送你洋娃娃");
    }

    @Override
    public void giveMoney() {
        System.out.println(girl.name + "送你钱");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.name + "送你鲜花");
    }
}
