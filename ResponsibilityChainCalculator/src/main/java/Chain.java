import Operation.*;

public class Chain {

    private final Operation firstNode;

    public Chain() {
        firstNode = new AddOperation(
                new SubtractOperation(
                        new MultiplyOperation(
                                new DivisionOperation(
                                        new ErrorOperation(null)))));
    }

    public void calculate(String equation){
        try{
            String[] symbols = equation.split(" ");
            int a = Integer.parseInt(symbols[0]);
            int b = Integer.parseInt(symbols[2]);
            char op = symbols[1].charAt(0);
            firstNode.checkOperation(a, b, op);
        }catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
