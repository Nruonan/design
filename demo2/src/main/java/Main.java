/**
 * @author Nruonan
 * @description
 */
public class Main {

    public static void main(String[] args) {
        CashContext context = new CashContext("正常收费");
        System.out.println(context.getResult(100));

        context = new CashContext("满300返100");
        System.out.println(context.getResult(400));

        context = new CashContext("打8折");
        System.out.println(context.getResult(500));
    }
}
