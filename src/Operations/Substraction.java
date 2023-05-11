package Operations;

import Exceptions.DivisionToNullException;

public class Substraction implements Operation{
    @Override
    public double getResultFor(double firstValue, double secondValue) throws DivisionToNullException {
        return firstValue - secondValue;
    }
}
