package carculaotr;

public class AddOperation implements AbstractOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
//    double operate(int firstNum, int secondNum){
//        return firstNum + secondNum;
//    }

}
