package MVC_Calculator;

public class CalculatorModel {
    public double sum(double x, double y) {
        return x + y;
    }

    public double difference(double x, double y) {
        return x - y;
    }

    public double product(double x, double y) {
        return x * y;
    }

    public double quotient(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Error: Division by zero");
        }
        return x / y;
    }
}
