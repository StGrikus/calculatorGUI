package Operations;

import Exceptions.DivisionToNullException;

public interface Operation {
    public double getResultFor(double firstValue, double secondValue) throws DivisionToNullException;
}
