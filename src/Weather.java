public class Weather {
    public static void main(String[] args) {

        double fah = 86;
        System.out.println(fah + " Stopni fahrenheita to .....");

       fah -=32;
       fah /=9;
       fah *=5;

        System.out.println(fah + " Stopni Celsiusza\n\n");

        double cel = 33;
        System.out.println(cel + " Stopni Celsiusza to .....");
        cel *= 9;
        cel /= 5;
        cel += 32;
        System.out.println(cel + " Stopni fahrenheita");


    }
}
