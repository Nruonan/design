import utils.Operation;
import utils.OperationAdd;
import utils.OperationDiv;
import utils.OperationMul;
import utils.OperationSub;

/**
 * @author Nruonan
 * @description
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
