public class ComplexFactory implements iComplexFactory {
   public Complex AlgebraicComplex( double real, double imaginary){
    return new AlgebraicComplex( real, imaginary);
   }
}
