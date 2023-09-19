package calc;

public class Main {
    public static void main(String[] args) {
        //Initialized an object called calculator
        Calculator calculator = new Calculator();
        /*to call a method
        use the object.methodName();
         */
        calculator.defaultValue = 3.00;
        calculator.add(3.00);
        calculator.multiply(3.00);
        calculator.divide(3.00);
        calculator.subtract(3.00);
        calculator.exponents(3.00);
        calculator.squareRoot(3.00);

        System.out.println(calculator.add(3.00));
        System.out.println(calculator.multiply(3.00));
        System.out.println(calculator.divide(3.00));
        System.out.println(calculator.squareRoot(3.00));
        System.out.println(calculator.exponents(3.00));
        System.out.println(calculator.subtract(3.00));




    }
}
