package carculaotr;

public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculator(int firstNum, int secondNum){
        double answer = 0;

        answer = operation.operate(firstNum, secondNum);
//        switch(operator){
//            case "+": answer = operation.operate(firstNum, secondNum);
//            return answer;
//
//            case "-": answer = operation.operate(firstNum, secondNum);
//                return answer;
//
//            case "*": answer = operation.operate(firstNum, secondNum);
//                return answer;
//
//            case "/": answer = operation.operate(firstNum, secondNum);
//                return answer;
//
//            case "%": answer = firstNum % secondNum;
//                return answer;
//        }
        return answer;
    }
}
