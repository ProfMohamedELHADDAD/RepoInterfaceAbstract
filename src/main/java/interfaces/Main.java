package interfaces;

public class Main {
    public static void main(String[] args) {
        Forme F;
        F = new Forme() {
            @Override
            public double surface() {
                return 0;
            }

            @Override
            public double perimetre() {
                return 0;
            }
        };
    }
}
