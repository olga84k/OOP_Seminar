public class DecLogAlgebraicComplex implements Complex{
    Complex decorator;
    iLoggable logger;
    public DecLogAlgebraicComplex(Complex decorator, iLoggable logger) {
        this.decorator = decorator;
        this.logger = logger;
    }
    @Override
    public double getReal() {
        double real = decorator.getReal();
    logger.log("Получение действительной части комплексного числа: " + real);
    return real;
    }
    @Override
    public double getImaginary() {
        double imaginary = decorator.getImaginary();
        logger.log("Получение мнимой части комплексного числа: " + imaginary);
        return imaginary;
    }
    @Override
    public Complex add(Complex other) {
        Complex result = decorator.add(other);
        logger.log("Cложение комплексных чисел: " + decorator + " and " + other + ". Result: " + result);
        return result;
    }
    @Override
    public Complex multiply(Complex other) {
        Complex result = decorator.multiply(other);
        logger.log("Умножение комплексных чисел: " + decorator + " and " + other + ". Result: " + result);
        return result;
    }
    @Override
    public Complex divide(Complex other) {
        Complex result = decorator.divide(other);
        logger.log("Вычитание комплексных чисел: " + decorator + " and " + other + ". Result: " + result);
        return result;
    }
    
}
