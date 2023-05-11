package Operations;

import Exceptions.DivisionToNullException;

public class Addiction implements Operation{
    @Override
    public double getResultFor(double firstValue, double secondValue) throws DivisionToNullException {
        return firstValue + secondValue;
    }
}
