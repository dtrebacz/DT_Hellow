import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {

        int accountBalance = 15_005;
        System.out.printf("Saldo: %,d zł %n",accountBalance); //d - decimal

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.3f%n",pi); //f - floated point
        System.out.printf(new Locale("us"),"%.3f%n",pi); //ustawienia amerykanskie





    }
}
