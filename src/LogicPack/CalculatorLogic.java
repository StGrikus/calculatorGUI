package LogicPack;

import Exceptions.UnsupportedException;
import Operations.*;
import java.util.*;

public class CalculatorLogic {
    private static final Map<Character, Operation> OPERATION = new HashMap();
    private final char operator;
    private double result;
    private final double firstNumber, secondNumber;

    public CalculatorLogic(char operator, double firstNumber, double secondNumber) throws Exception {
        this.operator = operator;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        calculateResult();
    }

    static{
        OPERATION.put('+', new Addiction());
        OPERATION.put('-', new Substraction());
        OPERATION.put('*', new Multoplication());
        OPERATION.put('/', new Division());
    }

    public String getResult(){
        return String.valueOf(result);
    }

    private void calculateResult() throws Exception{
        Operation operation = OPERATION.get(operator);
        if (operation !=null)
            operation.getResultFor(firstNumber, secondNumber);
        else
            throw new UnsupportedException();
    }

}
