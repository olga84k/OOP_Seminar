public class AlgebraicComplex implements Complex {
    private double real;
    private double imaginary;

    public AlgebraicComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other) {
        double real = this.real + other.getReal();
        double imaginary = this.imaginary + other.getImaginary();
        return new AlgebraicComplex(real, imaginary);
    }

    public Complex multiply(Complex other) {
        double real = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double imaginary = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new AlgebraicComplex(real, imaginary);
    }

    public Complex divide(Complex other) {
        double denominator = Math.pow(other.getReal(), 2) + Math.pow(other.getImaginary(), 2);
        double real = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / denominator;
        double imaginary = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / denominator;
        return new AlgebraicComplex(real, imaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

}
