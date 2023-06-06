public interface Complex {
    double getReal();

    double getImaginary();

    Complex add(Complex other);

    Complex multiply(Complex other);

    Complex divide(Complex other);
}
