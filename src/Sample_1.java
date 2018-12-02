import java.text.DecimalFormat;



public class Sample_1 {

    // Zmienne(stałe) statyczne (klasowe)
    static final double PI = 3.14;

    // zmienne egzemplaża
    int c;


    public static void main(String[] args) {
        //Zmienne lokalne
        int a = 2;
        int b = 3;
        String name = "";
        int x,y,z;
        String user = "Tomek", admin = "pawel";

        Sample_1 sample = new Sample_1(); // egzemplaż samego siebie

        System.out.println(sample.c);
        System.out.println(PI);

        System.out.println(user.length());



        final float ddb = 1.4F;

        char xxx = 't';

        //Iterały:

        long ia = 500_000;
        double xx = 12e-2;

        System.out.println(ia);
        System.out.println(xx);

        DecimalFormat df = new DecimalFormat("#.##########");
        System.out.println(df.format(xx));

        //systemy liczbowe

        b = 0b101;
        System.out.println(b);

        boolean choosen = true;

        System.out.println("raz \t dwa \t trzy \t");

        System.out.println("raz \t dwa \u2122 ");
    }
}
