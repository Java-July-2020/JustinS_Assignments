package Calculator;

public class CalculatorTest {
    public static void main(final String[] args) {
        Calculator newCalculator = new Calculator();
        newCalculator.performOperation(10.5, "+", 10.5);
        newCalculator.getResult();
    }
}