package Operation;

public class MultiplyOperation extends Operation{

    public MultiplyOperation(Operation nextOperation) {
        super(nextOperation);
    }

    @Override
    public void checkOperation(int a, int b, char op) {
        if(op == '*'){
            System.out.println(a*b);
        }else{
            super.checkOperation(a, b, op);
        }
    }
}
