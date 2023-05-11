package LogicPack;

public class ButtonLogic {
    private boolean isOperationSet = false;
    private double firstValue, secondValue, value;
    private char operation;

    public void setValue(double value) {
        this.value = value;
    }

    public void setValue(char operation){
       this.operation = operation;
       value = 0;
       isOperationSet = true;
    }

    public String getStringRepresentationOfOperation(){
        if(!isOperationSet){
            firstValue = value;
            return String.valueOf(firstValue);
        }
        else {
            secondValue = value;
            return String.valueOf(firstValue) + operation + String.valueOf(secondValue);
        }
    }

    public String getResult() throws Exception{
        return new CalculatorLogic(operation, firstValue, secondValue).getResult();
    }

}
