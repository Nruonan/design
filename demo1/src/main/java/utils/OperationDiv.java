package utils;

/**
 * @author Nruonan
 * @description
 */
public class OperationDiv extends Operation{

    @Override
    public double getResult() throws Exception {
        if (getNum2() == 0){
            throw new Exception("除数不能为0");
        }
        return getNum1() / getNum2();
    }
}
