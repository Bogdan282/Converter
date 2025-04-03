package app;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("App for measures convetring.");

        double kg = 5;
        double pounds = convKgToPounds(kg);
        System.out.println("Result is " + pounds + " pounds.");
    }
    private static double convKgToPounds(double kg) {
        return kg * CONV_K;
    }
}