package calc;

public class Calculator {
    public double defaultValue;



    /*
    *Access modifier
    * Return Datatype
    * Variable name
    * Parenthesis(To take parameters)
    * Curly braces{for block of code}
     */

    //valueToAdd is scoped inside the method and can't be accessed outside the method. It is a local value
    //but the add value is a global
    public double add(double valueToAdd) {
        return this.defaultValue + valueToAdd;
    }

    public double multiply(double valueToMultiply) {
        return this.defaultValue * valueToMultiply;
    }

    public double divide(double valueToDivide) {
        return this.defaultValue / valueToDivide;
    }

    public double subtract(double valueToSubtract) {
        return this.defaultValue - valueToSubtract;
    }

    public double exponents(double valueToExponents) {
        return Math.pow(this.defaultValue,valueToExponents);
    }

    public double squareRoot(double valueToSquareRoot) {
        return this.defaultValue + Math.sqrt(valueToSquareRoot);
    }

    //Standard Constructor
    //Needs a class name, the corresponding datatype and variable name as the parameter,
    //

}
