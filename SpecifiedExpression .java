public class SpecifiedExpression {
    public static void main(String[] args) {
        
        double resultA = (101 + 0) / 3.0;
        System.out.println("a) Result: " + resultA);

      
        double resultB = 3.0e-6 * 10000000.1;
        System.out.println("b) Result: " + resultB);

       
        boolean resultC = true && true;
        System.out.println("c) Result: " + resultC);

       
        boolean resultD = false && true;
        System.out.println("d) Result: " + resultD);

        
        boolean resultE = (false && false) || (true && true);
        System.out.println("e) Result: " + resultE);

        
        boolean resultF = (false || false) && (true && true);
        System.out.println("f) Result: " + resultF);
    }
}
