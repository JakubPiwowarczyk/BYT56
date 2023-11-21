package Operation;

public class ErrorOperation extends Operation{

    public ErrorOperation(Operation nextOperation) {
        super(nextOperation);
    }

    @Override
    public void checkOperation(int a, int b, char op) {
        System.out.println("The operation you are trying to perform is not valid!");
    }
}
