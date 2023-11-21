package Operation;

public class DivisionOperation extends Operation{

    public DivisionOperation(Operation nextOperation) {
        super(nextOperation);
    }

    @Override
    public void checkOperation(int a, int b, char op) {
        if(op == '/'){
            System.out.println(a/b);
        }else{
            super.checkOperation(a, b, op);
        }
    }
}
