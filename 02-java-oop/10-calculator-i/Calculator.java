package Calculator;

/**
 * Calculator
 */
public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public Calculator(){
    
    }

    public double getOperandOne(){
        return this.operandOne;
    }
    
    public void setOperandOne(Double operandOne){
        this.operandOne = operandOne;
    }

    public double getOperandTwo(){
        return this.operandTwo;
    }
    
    public void setOperandTwo(Double operandTwo){
        this.operandTwo = operandTwo;
    }

    public String getOperation(){
        return this.operation;
    }
    
    public void setOperation(String operation){
        this.operation = operation;

    }

    public void performOperation(Double operandOne, String operation, Double operandTwo){
        if(operation.equals("+")){
            result = operandOne + operandTwo;
        }
        else if(operation.equals("-")){
            result = operandOne - operandTwo;
        }
    }   

    public void getResult(){
        System.out.println(result);
    }

}