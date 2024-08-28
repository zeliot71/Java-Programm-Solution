import java.text.DecimalFormat;

public class DecimalFormation {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        double x =2263.156156456;

        System.out.println("X = "+df.format(x));
        System.out.printf("X = %.2f\n", x);
    }
}
