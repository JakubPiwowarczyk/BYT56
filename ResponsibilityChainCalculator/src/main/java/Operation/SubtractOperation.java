package Operation;

public class SubtractOperation extends Operation{

    public SubtractOperation(Operation nextOperation) {
        super(nextOperation);
    }

    @Override
    public void checkOperation(int a, int b, char op) {
        if(op == '-'){
            System.out.println(a-b);
        }else{
            super.checkOperation(a, b, op);
        }
    }
}
