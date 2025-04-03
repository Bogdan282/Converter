package app;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("App for measures convetring.");
        System.out.println("Version 1.0.");

        double kg = 5;
        double pnd = 12;
        double pounds = convKgToPounds(kg);
        double kgs = convKgToKgs(pnd);
        System.out.println("Result is " + pounds + " pounds and " + kgs + " kgs.");
    }
    private static double convKgToPounds(double kg) {
        return kg * CONV_K;
    }

    private static double convKgToKgs(double pnds) {
        return pnds / CONV_K;
    }
}