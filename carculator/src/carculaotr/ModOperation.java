package carculaotr;

public class ModOperation implements AbstractOperation{

    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }
}
