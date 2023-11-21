package Operation;

public abstract class Operation {

    private Operation nextOperation;

    public Operation(Operation nextOperation) {
        this.nextOperation = nextOperation;
    }

    public void checkOperation(int a, int b, char op){
        if(nextOperation != null)
            nextOperation.checkOperation(a, b, op);
    }
}
