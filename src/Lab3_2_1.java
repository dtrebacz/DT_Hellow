import java.util.StringTokenizer;

public class Lab3_2_1 {
    public static void main(String[] args) {

        String birdDate = "29/04/2016";

        System.out.println("Lab 3.2");
        System.out.println("1. Zamiana daty na oddzielne teksty");
        System.out.println("String birdDate = \"29/04/2016\";");

        StringTokenizer date = new StringTokenizer(birdDate,"/");
        System.out.println("DD: " + date.nextToken());
        System.out.println("MM: " + date.nextToken());
        System.out.println("YY: " + date.nextToken());






    }
}
