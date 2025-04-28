package InterfaceFonct;

public class Main {
    public static void main(String[] args) {
        Calcul addition = new Calcul() {
            @Override
            public double operation(double x, double y) {
                return x+y;
            }
        };
        // Avec Expression Lambda
        Calcul Multiplication = (x,y)->x*y ;
        System.out.println(addition.operation(10,20));
        System.out.println(Multiplication.operation(10,20));
        Calcul Puissance = (x,y)->Math.pow(x,y) ;
        System.out.println(Puissance.operation(10,2));

    }
}
