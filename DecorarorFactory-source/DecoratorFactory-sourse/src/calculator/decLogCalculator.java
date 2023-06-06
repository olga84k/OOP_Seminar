package calculator;

public class decLogCalculator implements Calculable
{
    private Calculable decorator;
    private iLoggable loger;

    public decLogCalculator(Calculator calculator, iLoggable loger) {
        this.decorator = calculator;
        this.loger = loger;
    }

    public decLogCalculator(int primaryArg) {
    }

    @Override
    public Calculable sum(int arg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    public Calculable multi(int arg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multi'");
    }

    @Override
    public int getResult() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResult'");
    }
    
}
