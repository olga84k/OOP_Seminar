package calculator;

public class DecLogCalcFactory implements ICalculableFactory {
    private iLoggable loger;

    public DecLogCalcFactory(Loger loger) {
        this.loger = loger;
    }
    public Calculable create(int primaryArg) {
        return new decLogCalculator(new Calculator(primaryArg), loger);
    }
}
