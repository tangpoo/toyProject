package carculaotr;

public class SubstractOperation implements AbstractOperation{
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

//    double operate(int firstNum, int secondNum){
//        return firstNum - secondNum;
//    }
}
