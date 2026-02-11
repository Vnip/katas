class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String returnString = "";
        
        if(operation == null){
           throw new IllegalArgumentException("Operation cannot be null");
        }
        
        if(operation.isEmpty()){
           throw new IllegalArgumentException("Operation cannot be empty");
        }

        if(!operation.equals("+") && !operation.equals("*") && !operation.equals("/")){
           throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        
        if(operation.equals("+")){
            int sum = operand1 + operand2;
            returnString = operand1 + " + " + operand2 + " = " + sum ;
        }
        
        if(operation.contains("*")){
            int multiplication = operand1 * operand2;
            returnString = operand1 + " * " + operand2 + " = " + multiplication ;
        }
        
        if(operation.contains("/")){
            if (operand2 == 0){
                throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
            }
            int divide = operand1 / operand2;
            returnString = operand1 + " / " + operand2 + " = " + divide ;
        }
        
        System.out.println(returnString);
        return returnString;
    }
}
