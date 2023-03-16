public class SwapVariables {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}