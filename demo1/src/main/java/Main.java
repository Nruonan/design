import utils.Operation;

/**
 * @author Nruonan
 * @description
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNum1(1);
        operate.setNum2(2);
        System.out.println(operate.getResult());


        operate = OperationFactory.createOperate("-");
        operate.setNum1(1);
        operate.setNum2(2);
        System.out.println(operate.getResult());

        operate = OperationFactory.createOperate("*");
        operate.setNum1(1);
        operate.setNum2(2);
        System.out.println(operate.getResult());

        operate = OperationFactory.createOperate("/");
        operate.setNum1(1);
        operate.setNum2(2);
        System.out.println(operate.getResult());

    }
}
