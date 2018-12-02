import java.util.StringTokenizer;

public class TokenTester {

    public static void main(String[] args) {
        StringTokenizer st1, st2;


        String quote1 = " GOOG 530,80 -9,98";
        System.out.println("quotel: "+ quote1);

        st1 = new StringTokenizer(quote1);

        System.out.println("Token1:" + st1.nextToken());
        System.out.println("Token1:" + st1.nextToken());
        System.out.println("Token1:" + st1.nextToken());

        System.out.println("");

        String quote2 = "RTH@75,00@0,22";
        st2 = new StringTokenizer(quote2,"@");

        System.out.println("Token2:" + st2.nextToken());
        System.out.println("Token2:" + st2.nextToken());
        System.out.println("Token2:" + st2.nextToken());




    }


}
