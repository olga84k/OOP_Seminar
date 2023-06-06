public class DecLogComplexFactory implements iComplexFactory {
    private iLoggable logger;

public DecLogComplexFactory(iLoggable logger) {
    this.logger = logger;
}

public Complex AlgebraicComplex( Double real, Double imaginary){
return new DecLogAlgebraicComplex(AlgebraicComplex(real,imaginary),logger);
}
}
