package carculaotr;

public class MultiplyOperation implements AbstractOperation{
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

//    double operate(int firstNum, int secondNum){
//        return firstNum * secondNum;
//    }
}
