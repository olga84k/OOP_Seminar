public class App {
    public static void main(String[] args) throws Exception {
Complex a = new AlgebraicComplex(1, 2);
Complex b = new AlgebraicComplex(3, 4);
Complex c = a.add(b);
System.out.println(c); // 4.0 + 6.0i
    
iComplexFactory complexFactory  = new DecLogComplexFactory(new Logger());
System.out.println(complexFactory); // вызовет логирование операции сложения
}
}
